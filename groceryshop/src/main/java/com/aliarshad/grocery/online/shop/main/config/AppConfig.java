package com.aliarshad.grocery.online.shop.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.aliarshad.grocery.online.shop.main.model.Cart;

@Configuration
public class AppConfig {
	@Bean
	@Scope("prototype")
	public Cart getCartBean() {
		return new Cart();
	}
}
