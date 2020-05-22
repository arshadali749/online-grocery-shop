package com.aliarshad.grocery.online.shop.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliarshad.grocery.online.shop.main.dao.CartDao;
import com.aliarshad.grocery.online.shop.main.model.Cart;
import com.aliarshad.grocery.online.shop.main.model.Product;
import com.aliarshad.grocery.online.shop.main.model.User;

@Service
public class CartService {

	@Autowired
	private CartDao cartdao;

	public Cart getCartByUser(User user) {
		return cartdao.findByUser(user);
	}

	public Cart insertCart(Cart cart) {
		return cartdao.save(cart);
	}

	public void updateCart(Cart updatedcart) {
		Cart crt = cartdao.getOne(updatedcart.getId());
		crt.setCartitems(updatedcart.getCartitems());
		cartdao.save(crt);

	}

}
