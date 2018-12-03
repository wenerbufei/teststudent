package com.ssm.example.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.example.entity.User;

public interface UserDAO {
	//通过用户名和密码查询User

	 User login(@Param("username") String username,
			 @Param("password")String password);
    //注册
	 public void addUser(User user);
	
}
