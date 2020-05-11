package com.aliarshad.grocery.online.shop.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aliarshad.grocery.online.shop.main.model.SubCategory;
import com.aliarshad.grocery.online.shop.main.service.CategoryService;
import com.aliarshad.grocery.online.shop.main.service.SubCategoryService;

@Controller
@RequestMapping("/admin")
public class SubCategoryController {
	@Autowired
	private SubCategoryService subcatservice;
	@Autowired
	private CategoryService catservice;
	

	@RequestMapping("/subcategories")
	public String home(Model model) {
		model.addAttribute("subcategories", subcatservice.getListOfSubCategories());
		model.addAttribute("categories", catservice.getListOfCategories());
		model.addAttribute("title", "LIST OF SUB CATEGORIES");
		model.addAttribute("view", "subcategories");
		return "/admin/home";
	}


	@RequestMapping("/add_subcategory")
	public String addCategory(SubCategory subcat, Model model,@RequestParam("categoryid")int categoryid) {
		System.out.println("CATEGORY ID="+categoryid);
		subcat.setCategory(catservice.findCategoryById(categoryid));
		subcatservice.addSubCategory(subcat);

		return "redirect:/admin/subcategories";
	}

	@RequestMapping("/delete_subcategory/{id}")
	public String deleteCategory(@PathVariable int id, Model model) {
		subcatservice.deleteSubCategoryById(id);

		return "redirect:/admin/subcategories";
	}

	@RequestMapping("/edit_subcategory/{id}")
	public String editCategory(@PathVariable int id, Model model) {
		model.addAttribute("subcat", subcatservice.findSubCategoryById(id));
		model.addAttribute("categories", catservice.getListOfCategories());
		model.addAttribute("view", "edit_subcategory");
		return "/admin/home";
	}

	@RequestMapping("/update_subcategory")
	public String updateCategory(SubCategory subcat, Model model,@RequestParam("categoryid")int categoryid) {

		subcat.setCategory(catservice.findCategoryById(categoryid));
		subcatservice.updateSubCategory(subcat);
		return "redirect:/admin/subcategories";
	}

	
}
