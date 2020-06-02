package com.aliarshad.grocery.online.shop.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliarshad.grocery.online.shop.main.dao.OrderDao;
import com.aliarshad.grocery.online.shop.main.model.Order;
import com.aliarshad.grocery.online.shop.main.model.User;

@Service
public class OrderService {
	@Autowired
	private OrderDao orderdao;

	public Order insertOrder(Order order) {
		return orderdao.save(order);
	}

	public List<Order> getListOfOrders(User user) {
		return orderdao.findByUser(user);
	}

	public Order getOrderById(int id) {
		return orderdao.getOne(id);
	}

	public void deleteOrderByOrder(Order order) {
		orderdao.delete(order);
	}
}
