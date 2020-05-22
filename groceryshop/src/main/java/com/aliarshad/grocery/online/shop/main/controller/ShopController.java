package com.aliarshad.grocery.online.shop.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aliarshad.grocery.online.shop.main.service.ProductService;

@Controller
@RequestMapping("shop")
public class ShopController {

	@Autowired
	private ProductService productservice;

	@RequestMapping("/")
	public String showListOfAllProduct(Model model) {
		model.addAttribute("products", productservice.getListOfProducts());
		model.addAttribute("view", "products_list");
		model.addAttribute("title", "Shop:products List");
		return "/userpages/home";
	}

	@RequestMapping("/product/description/{id}")
	public String showSingleProductDescription(@PathVariable int id, Model model) {
		model.addAttribute("product", productservice.getProductById(id));
		model.addAttribute("view", "product_description_view");
		model.addAttribute("title", "Shop:products List");
		return "/userpages/home";
	}
	
	@RequestMapping("/view/pictorial")
	public String showListOfAllProductWithPictures(Model model) {
		model.addAttribute("products", productservice.getListOfProducts());
		model.addAttribute("view", "products_list_with_pics");
		model.addAttribute("title", "PICTORIAL");
		return "/userpages/home";
	}
	

}
