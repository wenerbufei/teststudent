package com.ssm.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.example.dao.UserDAO;
import com.ssm.example.entity.User;
import com.ssm.example.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	// 通过@Autowired向spring容器注入UserDAO
	private UserDAO userDAO;

	public User login(String username, String password) {

		return userDAO.login(username, password);
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		return;
	}


}
