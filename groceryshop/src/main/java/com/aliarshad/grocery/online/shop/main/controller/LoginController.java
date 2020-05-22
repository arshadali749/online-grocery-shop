package com.aliarshad.grocery.online.shop.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aliarshad.grocery.online.shop.main.model.Category;
import com.aliarshad.grocery.online.shop.main.model.User;
import com.aliarshad.grocery.online.shop.main.service.CategoryService;
import com.aliarshad.grocery.online.shop.main.service.ProductService;
import com.aliarshad.grocery.online.shop.main.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {
	@Autowired
	private CategoryService catservice;
	@Autowired
	private UserService userservice;
	@Autowired
	private HttpSession session;
	@Autowired
	private ProductService productservice;

	@RequestMapping("/login/form")
	public String login(Model model) {

		model.addAttribute("title", "LOGIN");
		model.addAttribute("view", "login_form");
		return "/login";
	}

	@RequestMapping("/logout")
	public String logout(Model model) {
		session.removeAttribute("user");
		model.addAttribute("title", "LOGIN");
		return "/login";
	}

	@RequestMapping("/login")
	public String login(@RequestParam("cnic") String cnic, @RequestParam("password") String password,
			@RequestParam("type") String type, Model model) {

		User user = userservice.getUserByCnicAndPassword(cnic, password, type);
		System.out.println("USER FETCHED:" + user);
		if (user != null) {
			session.setAttribute("user", user);
			if (user.getType().equals("user")) {
				model.addAttribute("products", productservice.getListOfProducts());
				model.addAttribute("title", "shop");
				model.addAttribute("view", "products_list");
				return "redirect:/shop/";
			} else if (user.getType().equals("admin")) {
				return "/admin/home";
			}
		} else {
			model.addAttribute("title", "LOGIN");
			model.addAttribute("view", "login");

		}
		return "redirect:/user/login/form";
	}

	@RequestMapping("/sign_up")
	public String sign_up(Model model) {

		model.addAttribute("title", "SIGN UP");
		model.addAttribute("view", "sign_up");
		return "/admin/home";
	}

}
