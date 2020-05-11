package com.aliarshad.grocery.online.shop.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aliarshad.grocery.online.shop.main.model.Company;
import com.aliarshad.grocery.online.shop.main.service.CompanyService;

@Controller
@RequestMapping("/admin")
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@RequestMapping("/companies")
	public String getListOfCompanies(Model model) {
		model.addAttribute("companies", companyService.getListOfCompanies());
		model.addAttribute("title", "COMPANIES LIST");
		model.addAttribute("view", "companies");
		return "/admin/home";
	}

	@RequestMapping("/get/company/{id}")
	public Company getCompanyById(int id) {
		return companyService.getCompanyById(id);
	}

	@RequestMapping("/delete/company/{id}")
	public String deleteCompanyById(@PathVariable int id) {
		companyService.deleteCompanyById(id);
		return "redirect:/admin/companies";
	}

	@RequestMapping("/update/company")
	public void updateConpany(Company company) {
		companyService.updateConpany(company);
	}

	@RequestMapping("/insert/company")
	public String addCompany(Company company) {
		companyService.addComapny(company);
		return "redirect:/admin/companies";
	}

}
