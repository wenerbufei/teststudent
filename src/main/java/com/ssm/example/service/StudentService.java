package com.ssm.example.service;

import java.util.List;

import com.ssm.example.entity.Student;

public interface StudentService {
	
	//增加
	void creat(Student student);
	//查詢所有
	public List<Student> findAll();
	//根据id删除客户
	void delete(int id);
	//修改
	void update(Student student);
	//找到一条数据
	Student get(int id);
	
}
