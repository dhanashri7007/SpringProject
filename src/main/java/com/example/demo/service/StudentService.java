package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;


public interface StudentService {
	void addStudent(Student student);

	Student getStudent(int id);
	
	List<Student> getAllStudents();
		
	

}
