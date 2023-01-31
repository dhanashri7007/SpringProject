package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/list")
	public List<Student> liststudents(){
		return service.getAllStudents();
		
	}
	@GetMapping("/showstudents/{id}")
	public Student findById(@PathVariable int id) {
		return service.getStudent(id);
		
	}
	@PostMapping("/save")
	public Student save(@RequestBody Student e) {
		e.setStudent_id(0);
		service.addStudent(e);
		return e;
		
	}


}
