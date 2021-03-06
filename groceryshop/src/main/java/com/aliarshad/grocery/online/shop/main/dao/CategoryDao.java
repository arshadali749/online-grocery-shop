package com.aliarshad.grocery.online.shop.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliarshad.grocery.online.shop.main.model.Category;
@Repository
public interface CategoryDao extends JpaRepository<Category, Integer> {

}
