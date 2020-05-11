package com.aliarshad.grocery.online.shop.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliarshad.grocery.online.shop.main.dao.CompanyDao;
import com.aliarshad.grocery.online.shop.main.model.Company;

@Service
public class CompanyService {
	@Autowired
	private CompanyDao companydao;

	public List<Company> getListOfCompanies() {
		return companydao.findAll();
	}

	public Company getCompanyById(int id) {
		return companydao.getOne(id);
	}

	public void deleteCompanyById(int id) {
		companydao.deleteById(id);
	}

	public void updateConpany(Company company) {

		Company updatedCompany = getCompanyById(company.getId());
		updatedCompany.setName(company.getName());
		updatedCompany.setType(company.getType());
		companydao.save(updatedCompany);
	}

	public void addComapny(Company company) {
		companydao.save(company);

	}
}
