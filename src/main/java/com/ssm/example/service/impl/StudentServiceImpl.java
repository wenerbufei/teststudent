package com.ssm.example.service.impl;

import java.util.List;

import com.ssm.example.dao.StudentDAO;
import com.ssm.example.entity.Student;
import com.ssm.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {

	@Autowired  //注入
	private StudentDAO studentDAO;
	
	//查询所有
	public List<Student> findAll() {
		return studentDAO.findAll();
	}
    //删除
	public void delete(int id) {
		this.studentDAO.delete(id);
	}
    //修改
	public void update(Student student) {
		studentDAO.update(student);
	}
    //添加
	public void creat(Student student) {
		studentDAO.creat(student);
	}
   //找到一条数据
	public Student get(int id) {
		return studentDAO.get(id);
	}

}
