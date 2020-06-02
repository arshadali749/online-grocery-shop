package com.aliarshad.grocery.online.shop.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliarshad.grocery.online.shop.main.model.Order;
import com.aliarshad.grocery.online.shop.main.model.OrderItem;

public interface OrderItemDao extends JpaRepository<OrderItem, Integer> {

	public List<OrderItem> findByOrder(Order order);
}
