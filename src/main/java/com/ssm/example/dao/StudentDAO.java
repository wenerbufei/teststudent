package com.ssm.example.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.example.entity.Student;

public interface StudentDAO {
	


	// 查询所有
	public List<Student> findAll();

	//tianjia
	public void creat(Student student);

	// 删除
	public void delete(int id);

	// 查询一条数据
	public Student get(int id);

	// 修改
	public int update(Student student);

}
