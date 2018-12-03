package com.ssm.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.example.entity.User;
import com.ssm.example.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String regist(User user) {
		userService.addUser(user);
		return "redirect:login";
		
	}	

	@RequestMapping("/login")
	public String login(ModelMap map, @RequestParam(required = false, value = "username") String username,
			@RequestParam(required = false, value = "password") String password) {
		
       
//		if (StringUtils.isNullOrEmpty(username) || StringUtils.isNullOrEmpty(password)) {
//			return "login";
//		}
	   
		User user = userService.login(username, password);
		if (user != null) {
			
//			跳转到页面——跳转到后台-在跳到页面
			//return "redirect:index";
			return "redirect:/student/findAll";
		}
		return "login";	
	
   }
		
}

	
