package com.ssm.example.service;

import com.ssm.example.entity.User;

public interface UserService {

	// 通过用户名和密码查询User
	public User login(String username, String password );
   
	//
	public void addUser(User user);

	
}
