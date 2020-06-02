package com.aliarshad.grocery.online.shop.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliarshad.grocery.online.shop.main.model.Order;
import com.aliarshad.grocery.online.shop.main.model.User;

public interface OrderDao extends JpaRepository<Order, Integer> {

	public List<Order> findByUser(User user);
}
