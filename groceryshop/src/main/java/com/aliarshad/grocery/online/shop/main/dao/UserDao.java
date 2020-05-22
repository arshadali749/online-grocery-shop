package com.aliarshad.grocery.online.shop.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliarshad.grocery.online.shop.main.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	public User findByCnicAndPasswordAndType(String cnic, String password,String type);
}
