package com.ssm.example.entity;

public class User {

	private Integer id; // 主键
	private String username; // 用户姓名
	private String password; // 密码
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "login [id=" + id + ", userName=" + username + ", password=" + password + "]";
	}
	
	

}
