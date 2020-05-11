package com.aliarshad.grocery.online.shop.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aliarshad.grocery.online.shop.main.model.Category;
import com.aliarshad.grocery.online.shop.main.service.CategoryService;

@Controller
@RequestMapping("/admin")
public class CategoryController {
	@Autowired
	private CategoryService catservice;

	@RequestMapping("/categories")
	public String home(Model model) {
		model.addAttribute("categories", catservice.getListOfCategories());
		model.addAttribute("title", "ADMIN:LIST OF THE CATEGORIES");
		model.addAttribute("view", "categories");
		return "/admin/home";
	}

	@RequestMapping("/add_category")
	public String addCategory(Category cat, Model model) {
		model.addAttribute("title", "ADMIN:INSERT CATEGORY");
		System.out.println(cat.toString());
		catservice.addCategory(cat);

		return "redirect:/admin/categories";
	}

	@RequestMapping("/delete_category/{id}")
	public String deleteCategory(@PathVariable int id, Model model) {
		model.addAttribute("title", "ADMIN:delete category ");
		catservice.deleteCategoryById(id);

		return "redirect:/admin/categories";
	}

	@RequestMapping("/edit_category/{id}")
	public String editCategory(@PathVariable int id, Model model) {
		model.addAttribute("title", "ADMIN:edit_category");
		model.addAttribute("category", catservice.findCategoryById(id));
		model.addAttribute("view", "edit_category");
		return "/admin/home";
	}

	@RequestMapping("/update_category")
	public String updateCategory(Category cat, Model model) {
		catservice.updateCategory(cat);
		return "redirect:/admin/categories";
	}

}
