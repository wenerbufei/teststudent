package com.ssm.example.controller;

import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.example.dao.StudentDAO;
import com.ssm.example.entity.Student;
import com.ssm.example.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.example.service.StudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	Student student = new Student();

	@Autowired
	// 定义StudentService类型的属性
	private StudentService studentService;

	@RequestMapping(value = "/findAll")
	
	 public String pageList(ModelMap map,@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo){
		 
		Integer pageSize=4;//每页显示记录数
	    //分页查询
	    PageHelper.startPage(pageNo, pageSize);
	    List<Student> userList = studentService.findAll();//获取所有用户信息
	    PageInfo<Student> pageInfo=new PageInfo<Student>(userList);
	     map.addAttribute("pageInfo", pageInfo);
	     return "index";
    }

	/*public ModelAndView test() {
		List<Student> list = studentService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("list", list);
		return modelAndView;
	}*/

	@RequestMapping(value = "/creat")
	public String creat(Student student) {
		studentService.creat(student);
		//这zzzzzzzzzzz 大大的bug
		// ModelAndView mv = new ModelAndView();
		return "redirect:findAll";
	}

	// 删除用户
	@RequestMapping(value = "/delete")
	public String delete(int id) {
		this.studentService.delete(id);
		return "redirect:findAll";
	}

	//
	@RequestMapping(value = "/editstudent")
	public ModelAndView editstudent(int id) {
		ModelAndView mav = new ModelAndView("editstudent");
		Student student = studentService.get(id);
		mav.addObject("student", student);
		return mav;
		// return "redirect:findAll";
	}

	@RequestMapping(value = "/updatestudent")
	public ModelAndView updatestudent(Student student) {
		studentService.update(student);
		ModelAndView mv = new ModelAndView("redirect:findAll");
		return mv;
	}
}
