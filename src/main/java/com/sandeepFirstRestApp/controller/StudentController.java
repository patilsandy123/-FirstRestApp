package com.sandeepFirstRestApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandeepFirstRestApp.model.Student;

@RestController
public class StudentController {
	
	private Student stu;

	@GetMapping("/stu")
	public Student getStudent() {
		
		Student stu= new Student();
		stu.setSid(11);
		stu.setSname("sandeep");
		stu.setSaddr("pune");
		return stu; 
	}
		@GetMapping("/getStudents")
		public List<Student> getStudents() {
			
			Student stu1= new Student();
			stu1.setSid(13);
			stu1.setSname("akshay");
			stu1.setSaddr("mumbai");
			
			Student stu2= new Student();
			stu2.setSid(12);
			stu2.setSname("pradeep");
			stu2.setSaddr("nasik");
			
			List<Student> list= new ArrayList();
			list.add(stu);
			list.add(stu1);
			list.add(stu2);
			
			
			
			return list;
		
		
		
		
	}
	
	
	

}
