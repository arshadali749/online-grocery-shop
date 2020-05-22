package com.aliarshad.grocery.online.shop.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aliarshad.grocery.online.shop.main.model.Cart;
import com.aliarshad.grocery.online.shop.main.model.User;
import com.aliarshad.grocery.online.shop.main.service.CartService;
import com.aliarshad.grocery.online.shop.main.service.ProductService;
import com.aliarshad.grocery.online.shop.main.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userservice;
	@Autowired
	private CartService cartservice;
	@Autowired
	private ProductService productservice;

	@RequestMapping("/insert")
	public String insertUser(User user, Cart cart) {

		Cart crt = cartservice.insertCart(cart);
		user.setCart(crt);
		User u = userservice.insertUser(user);
		crt.setUser(u);
		cartservice.updateCart(crt);
		return "redirect:/user/login/form";
	}

}
