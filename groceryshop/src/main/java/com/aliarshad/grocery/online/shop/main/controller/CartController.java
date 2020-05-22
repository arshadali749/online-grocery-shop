package com.aliarshad.grocery.online.shop.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aliarshad.grocery.online.shop.main.service.CartItemService;
import com.aliarshad.grocery.online.shop.main.service.CartService;
import com.aliarshad.grocery.online.shop.main.service.ProductService;
import com.aliarshad.grocery.online.shop.main.service.UserService;

@Controller
@RequestMapping("cart")
public class CartController {
	@Autowired
	private CartService cartservice;
	@Autowired
	private ProductService productservice;
	@Autowired
	private CartItemService cartitemservice;
	@Autowired
	private UserService userservice;
	@Autowired
	private HttpSession session;

	@RequestMapping("/")
	public String goToHome(Model model) {
		model.addAttribute("view", "cartview");
		return "/userpages/home";

	}

//	@RequestMapping("/insert")
//	public String updateCart(@RequestParam("prod_id") int prod_id, @RequestParam("prod_qty") int prod_qty,
//			CartItem cartitem, Model model) {
//
//		User user = (User) session.getAttribute("user");
//		Product product = productservice.getProductById(prod_id);
//		cartitem.setProduct(product);
//		cartitem.setItem_quantity(prod_qty);
//		cartitem.setSubtotal(prod_qty * product.getProd_unit_price());
//
//		user.getCart().getCartitems().add(cartitem);
//		userservice.updateUser(user);
//		model.addAttribute("cartitems", user.getCart().getCartitems());
//		model.addAttribute("view", "cartview");
//		return "/userpages/home";
//
//	}

}
