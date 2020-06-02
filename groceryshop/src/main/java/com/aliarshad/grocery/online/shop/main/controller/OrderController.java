package com.aliarshad.grocery.online.shop.main.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aliarshad.grocery.online.shop.main.model.Order;
import com.aliarshad.grocery.online.shop.main.model.OrderItem;
import com.aliarshad.grocery.online.shop.main.model.User;
import com.aliarshad.grocery.online.shop.main.service.OrderItemService;
import com.aliarshad.grocery.online.shop.main.service.OrderService;
import com.aliarshad.grocery.online.shop.main.service.ProductService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderservice;
	@Autowired
	OrderItemService orderitemservice;
	@Autowired
	ProductService productservice;
	@Autowired
	HttpSession session;

	@RequestMapping("/")
	public String getListOfOrders(Model model) {
		User user = (User) session.getAttribute("user");
		model.addAttribute("orders", orderservice.getListOfOrders(user));
		model.addAttribute("view", "orders");
		model.addAttribute("title", "ORDERS");
		return "/userpages/home";

	}

	@RequestMapping("/detail/{id}")
	public String getOrderDetail(@PathVariable int id, Model model) {
		Order order = orderservice.getOrderById(id);
		System.out.print("ORDER DETAIL CONTSINES ITEMS:::::" + orderitemservice.getListOfOrderItemsByOrder(order));
		model.addAttribute("orderitems", orderitemservice.getListOfOrderItemsByOrder(order));
		model.addAttribute("title", "ORDER DETAIL");
		model.addAttribute("view", "order_detail");
		return "/userpages/home";
	}

	@RequestMapping("/cancel/{id}")
	public String cancelOrder(@PathVariable int id, Model model) {
		Order order = orderservice.getOrderById(id);
		List<OrderItem> orderItemsList = orderitemservice.getListOfOrderItemsByOrder(order);
		for (OrderItem item : orderItemsList) {
			orderitemservice.deleteOrderItem(item.getId());
		}
		orderservice.deleteOrderByOrder(order);
		return "redirect:/order/";
	}

}
