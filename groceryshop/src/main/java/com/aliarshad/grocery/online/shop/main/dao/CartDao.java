package com.aliarshad.grocery.online.shop.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliarshad.grocery.online.shop.main.model.Cart;
import com.aliarshad.grocery.online.shop.main.model.User;
@Repository
public interface CartDao extends JpaRepository<Cart,Integer> {

	Cart findByUser(User user);
}
