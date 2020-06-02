package com.aliarshad.grocery.online.shop.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.aliarshad.grocery.online.shop.main.model.Cart;
import com.aliarshad.grocery.online.shop.main.model.CartItem;
import com.aliarshad.grocery.online.shop.main.model.Order;
import com.aliarshad.grocery.online.shop.main.model.OrderItem;

@Configuration
public class AppConfig {
	@Bean
	@Scope("prototype")
	public Cart getCartBean() {
		return new Cart();
	}

	@Bean
	@Scope("prototype")
	public Order getOrderBean() {
		return new Order();
	}

	@Bean
	@Scope("prototype")
	public OrderItem getOrderItemBean() {
		return new OrderItem();
	}

	@Bean
	@Scope("prototype")
	public CartItem getCartItemBean() {
		return new CartItem();
	}
}
