package com.aliarshad.grocery.online.shop.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliarshad.grocery.online.shop.main.dao.CategoryDao;
import com.aliarshad.grocery.online.shop.main.model.Category;
import com.aliarshad.grocery.online.shop.main.service.CategoryService;

@Service
public class CategoryService {
	@Autowired
	private CategoryDao catrepo;

	
	public List<Category> getListOfCategories() {
		return catrepo.findAll();

	}

	
	public Category findCategoryById(int id) {

		return catrepo.getOne(id);
	}

	
	public void deleteCategoryById(int id) {
		catrepo.deleteById(id);

	}

	
	public void updateCategory(Category cat) {
		Category current = catrepo.getOne(cat.getId());
		current.setName(cat.getName());
		current.setDescription(cat.getDescription());
		catrepo.save(current);
	}


	public void addCategory(Category cat) {
		catrepo.save(cat);

	}

}
