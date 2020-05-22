package com.aliarshad.grocery.online.shop.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliarshad.grocery.online.shop.main.model.Cart;
import com.aliarshad.grocery.online.shop.main.model.CartItem;

@Repository
public interface CartItemDao extends JpaRepository<CartItem, Integer> {

	List<CartItem> findByCart(Cart cart);

}
