package com.aliarshad.grocery.online.shop.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aliarshad.grocery.online.shop.main.model.Category;
import com.aliarshad.grocery.online.shop.main.model.Company;
import com.aliarshad.grocery.online.shop.main.model.Product;
import com.aliarshad.grocery.online.shop.main.model.SubCategory;
import com.aliarshad.grocery.online.shop.main.service.CategoryService;
import com.aliarshad.grocery.online.shop.main.service.CompanyService;
import com.aliarshad.grocery.online.shop.main.service.ProductService;
import com.aliarshad.grocery.online.shop.main.service.SubCategoryService;

@Controller
@RequestMapping("/admin")
public class ProductController {
	@Autowired
	private ProductService productservice;
	@Autowired
	private CompanyService companyservice;
	@Autowired
	private CategoryService categoryservice;
	@Autowired
	private SubCategoryService subcategoryservice;

	@RequestMapping("/new/product/form")
	public String newProductForm(Model model)

	{

		model.addAttribute("companies", companyservice.getListOfCompanies());
		model.addAttribute("categories", categoryservice.getListOfCategories());
		model.addAttribute("subcategories", subcategoryservice.getListOfSubCategories());
		model.addAttribute("view", "new_product_form");
		model.addAttribute("title", "ADMIN;PRODUCTS");

		return "/admin/home";
	}

	@RequestMapping("/products")
	public String getListOfProducts(Model model)

	{

		System.out.println("PRODUCTS::::" + productservice.getListOfProducts());
		model.addAttribute("products", productservice.getListOfProducts());
		model.addAttribute("view", "products");
		model.addAttribute("title", "ADMIN;PRODUCTS");

		return "/admin/home";
	}

	@RequestMapping("/product/insert")
	public String addProduct(Product product, @RequestParam("companyid") int companyid,
			@RequestParam("categoryid") int categoryid, @RequestParam("subcategoryid") int subcategoryid, Model model)

	{

		Company company = companyservice.getCompanyById(companyid);
		Category category = categoryservice.findCategoryById(categoryid);
		SubCategory subcategory = subcategoryservice.findSubCategoryById(subcategoryid);
		product.setProd_category(category);
		product.setProd_subcategory(subcategory);
		product.setProd_company(company);
		productservice.insertProduct(product);
		model.addAttribute("companies", companyservice.getListOfCompanies());
		model.addAttribute("categories", categoryservice.getListOfCategories());
		model.addAttribute("subcategories", subcategoryservice.getListOfSubCategories());
		model.addAttribute("view", "products");
		model.addAttribute("title", "ADMIN;PRODUCTS");

		return "redirect:/admin/products";
	}

	@RequestMapping("/product/edit/{id}")
	public String editProduct(@PathVariable int id, Model model)

	{

		Product product = productservice.getProductById(id);
		model.addAttribute("product", product);
		model.addAttribute("companies", companyservice.getListOfCompanies());
		model.addAttribute("categories", categoryservice.getListOfCategories());
		model.addAttribute("subcategories", subcategoryservice.getListOfSubCategories());
		model.addAttribute("view", "edit_product");
		model.addAttribute("title", "ADMIN;PRODUCTS");
        return "/admin/home";
	}

	@RequestMapping("/product/delete/{id}")
	public String deleteProduct(@PathVariable int id, Model model)

	{
        productservice.deleteProductById(id);
		return "redirect:/admin/products";
		
	}

	@RequestMapping("/product/update")
	public String  updateProduct(Product updatedProduct, @RequestParam("companyid") int companyid,
			@RequestParam("categoryid") int categoryid, @RequestParam("subcategoryid") int subcategoryid, Model model)

	{
		Company company = companyservice.getCompanyById(companyid);
		Category category = categoryservice.findCategoryById(categoryid);
		SubCategory subcategory = subcategoryservice.findSubCategoryById(subcategoryid);

		updatedProduct.setProd_category(category);
		updatedProduct.setProd_subcategory(subcategory);
		updatedProduct.setProd_company(company);
		
		productservice.updateProduct(updatedProduct);
		model.addAttribute("companies", companyservice.getListOfCompanies());
		model.addAttribute("categories", categoryservice.getListOfCategories());
		model.addAttribute("subcategories", subcategoryservice.getListOfSubCategories());
		return "redirect:/admin/products";

	}

}
