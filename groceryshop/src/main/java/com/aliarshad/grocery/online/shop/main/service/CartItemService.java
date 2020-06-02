package com.aliarshad.grocery.online.shop.main.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliarshad.grocery.online.shop.main.dao.CartItemDao;
import com.aliarshad.grocery.online.shop.main.model.Cart;
import com.aliarshad.grocery.online.shop.main.model.CartItem;

@Service
public class CartItemService {
	@Autowired
	private CartItemDao cartitemdao;

	public CartItem insertCartItem(CartItem cartitem) {
		return cartitemdao.save(cartitem);
	}

	public CartItem getCartItem(int id) {
		return cartitemdao.getOne(id);
	}

	public List<CartItem> getListOfCartItems() {
		return cartitemdao.findAll();
	}

	public void deleteCartItem(int id) {
		cartitemdao.deleteById(id);
	}

	public void updateCartItem(CartItem updated) {
		CartItem cartItem = getCartItem(updated.getItem_id());
		cartItem.setItem_quantity(updated.getItem_quantity());
		cartItem.setSubtotal(updated.getSubtotal());
		cartItem.setTotal(updated.getTotal());
	}

	public void saveCartItemsList(List<CartItem> cartitems) {
		cartitemdao.saveAll(cartitems);
	}

	public List<CartItem> getCartItemsByCart(Cart cart) {
		return cartitemdao.findByCart(cart);
	}

	public void deleteCartItemById(int id) {
		cartitemdao.deleteById(id);
	}

	public void updateCartItem(int id, int qty) {
		CartItem cartitem = cartitemdao.getOne(id);
		cartitem.setItem_quantity(qty);
		cartitemdao.save(cartitem);
	}

}
