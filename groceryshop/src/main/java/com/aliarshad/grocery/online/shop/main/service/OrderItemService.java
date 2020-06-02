package com.aliarshad.grocery.online.shop.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliarshad.grocery.online.shop.main.dao.CartItemDao;
import com.aliarshad.grocery.online.shop.main.dao.OrderItemDao;
import com.aliarshad.grocery.online.shop.main.model.Order;
import com.aliarshad.grocery.online.shop.main.model.OrderItem;

@Service
public class OrderItemService {
	@Autowired
	private OrderItemDao orderitemdao;

	public OrderItem insertOrderItem(OrderItem orderitem) {
		return orderitemdao.save(orderitem);
	}

	public List<OrderItem> getListOfOrderItemsByOrder(Order order) {
		return orderitemdao.findByOrder(order);
	}

	public void deleteOrderItem(int id) {
		orderitemdao.deleteById(id);
	}

	public OrderItem getOrderItemById(int id) {
		return orderitemdao.getOne(id);
	}

	public void updateOrderItem(int id, int qty) {
		OrderItem orderitem = orderitemdao.getOne(id);
		orderitem.setItem_quantity(qty);
		orderitemdao.save(orderitem);

	}
}
