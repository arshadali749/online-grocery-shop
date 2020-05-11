package com.aliarshad.grocery.online.shop.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliarshad.grocery.online.shop.main.dao.SubCategoryDao;
import com.aliarshad.grocery.online.shop.main.model.SubCategory;

@Service
public class SubCategoryService {
	@Autowired
	private SubCategoryDao dao;

	public List<SubCategory> getListOfSubCategories() {

		return dao.findAll();
	}

	public void addSubCategory(SubCategory subcat) {
		dao.save(subcat);

	}

	public void deleteSubCategoryById(int id) {
		dao.deleteById(id);

	}

	public SubCategory findSubCategoryById(int id) {
		return dao.getOne(id);

	}

	public void updateSubCategory(SubCategory subcat) {
		SubCategory updated = dao.getOne(subcat.getId());
		updated.setDescription(subcat.getDescription());
		updated.setName(subcat.getName());
		updated.setCategory(subcat.getCategory());
		dao.save(updated);

	}

}
