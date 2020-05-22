package com.aliarshad.grocery.online.shop.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliarshad.grocery.online.shop.main.dao.UserDao;
import com.aliarshad.grocery.online.shop.main.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userdao;

	public User getUserByCnicAndPassword(String cnic, String password,String type) {
		return userdao.findByCnicAndPasswordAndType(cnic, password,type);
	}

	public User getUserById(int id) {
		return userdao.getOne(id);
	}

	public List<User> getListOfUsers() {
		return userdao.findAll();
	}

	public void deleteUserById(int id) {
		userdao.deleteById(id);
	}

	public void updateUser(User updateduser) {
		User user = getUserById(updateduser.getId());
		user.setCnic(updateduser.getCnic());
		user.setPassword(updateduser.getPassword());
		user.setType(updateduser.getType());
		userdao.save(user);

	}

	public User insertUser(User user) {
		return userdao.save(user);
	}
}
