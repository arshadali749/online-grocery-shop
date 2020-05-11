package com.aliarshad.grocery.online.shop.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aliarshad.grocery.online.shop.main.service.CategoryService;

@Controller
@RequestMapping("/admin")
public class HomeController {

	@Autowired
	private CategoryService catservice;

	@RequestMapping("/")
	public String homme(Model model) {
		model.addAttribute("categories", catservice.getListOfCategories());
		model.addAttribute("title", "ADMIN:LIST OF THE CATEGORIES");
		model.addAttribute("view", "categories");
		return "/admin/home";
	}
}
