package com.aliarshad.grocery.online.shop.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aliarshad.grocery.online.shop.main.model.Cart;
import com.aliarshad.grocery.online.shop.main.model.CartItem;
import com.aliarshad.grocery.online.shop.main.model.Product;
import com.aliarshad.grocery.online.shop.main.model.User;
import com.aliarshad.grocery.online.shop.main.service.CartItemService;
import com.aliarshad.grocery.online.shop.main.service.CartService;
import com.aliarshad.grocery.online.shop.main.service.ProductService;

@Controller
@RequestMapping("/cartitem")
public class CartItemController {
	@Autowired
	private CartItemService cartitemservice;
	@Autowired
	private CartService cartservice;
	@Autowired
	private ProductService productservice;
	@Autowired
	private HttpSession session;

	@RequestMapping("/")
	public String getListOfItemsInCart(Model model) {
		User user = (User) session.getAttribute("user");
		Cart cart = user.getCart();
		model.addAttribute("cartitems", cartitemservice.getCartItemsByCart(cart));
		model.addAttribute("view", "cartview");
		return "/userpages/home";
	}

	@RequestMapping("/insert")
	public String insertCartItem(CartItem cartitem, @RequestParam int prod_id, @RequestParam int prod_qty) {
		Product product = productservice.getProductById(prod_id);
		User user = (User) session.getAttribute("user");
		cartitem.setCart(user.getCart());
		cartitem.setProduct(product);
		cartitem.setCart(user.getCart());
		cartitem.setItem_quantity(prod_qty);
		cartitem.setSubtotal(prod_qty * (product.getProd_unit_price()));
		cartitemservice.insertCartItem(cartitem);
		return "redirect:/cartitem/";
	}

}
