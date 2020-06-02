package com.aliarshad.grocery.online.shop.main.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aliarshad.grocery.online.shop.main.model.Cart;
import com.aliarshad.grocery.online.shop.main.model.CartItem;
import com.aliarshad.grocery.online.shop.main.model.Order;
import com.aliarshad.grocery.online.shop.main.model.OrderItem;
import com.aliarshad.grocery.online.shop.main.model.User;
import com.aliarshad.grocery.online.shop.main.service.CartItemService;
import com.aliarshad.grocery.online.shop.main.service.OrderItemService;
import com.aliarshad.grocery.online.shop.main.service.OrderService;
import com.aliarshad.grocery.online.shop.main.service.ProductService;

@Controller
@RequestMapping("/orderitem")
public class OrderItemController {
	@Autowired
	private CartItemService cartitemservice;
	@Autowired
	private OrderItemService orderitemservice;
	@Autowired
	private OrderService orderservice;
	@Autowired
	ProductService productservice;
	@Autowired
	private HttpSession session;

	@RequestMapping("/checkout")
	public String insertOrderItem(Order order) {
		User user = (User) session.getAttribute("user");
		Cart cart = user.getCart();
		order.setStatus("placed");
		order.setUser(user);
		Order ord = orderservice.insertOrder(order);
		List<CartItem> cartitems = cartitemservice.getCartItemsByCart(cart);
		for (CartItem cartitem : cartitems) {
			OrderItem orderitem = new OrderItem();
			System.out.println("cart item:" + cartitem);
			System.out.println("ITem insered into the ordero");
			orderitem.setItem_quantity(cartitem.getItem_quantity());
			orderitem.setOrder(ord);
			orderitem.setProduct(cartitem.getProduct());
			orderitem.setSub_total(cartitem.getSubtotal());
			orderitem.setTotal(cartitem.getTotal());
			orderitemservice.insertOrderItem(orderitem);
			cartitemservice.deleteCartItemById(cartitem.getItem_id());

		}
		return "redirect:/order/";

	}

	@RequestMapping("/edit/orderitem/{id}")
	public String getFormToEditOrderItem(@PathVariable int id, Model model) {
		OrderItem orderitem = orderitemservice.getOrderItemById(id);
		model.addAttribute("orderitem", orderitem);
		model.addAttribute("product", productservice.getProductById(orderitem.getProduct().getProd_id()));
		model.addAttribute("title", "EDIT ORDER ITEM");
		model.addAttribute("view", "edit_order_item");
		return "/userpages/home";
	}

	@RequestMapping("/delete/{order_id}/orderitem/{id}")
	public String deleteOrderItem(@PathVariable int id, @PathVariable int order_id, Model model) {
		orderitemservice.deleteOrderItem(id);
		return "redirect:/order/detail/" + order_id;
	}

	@RequestMapping("/update/{order_id}")
	public String updateOrderItem(@RequestParam int prod_id, @RequestParam int item_qty, @PathVariable int order_id) {
		orderitemservice.updateOrderItem(prod_id, item_qty);
		return "redirect:/order/detail/" + order_id;
	}

}
