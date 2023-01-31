package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;
	

	@Override
	public void addStudent(Student student) 
	{
	
		dao.save(student);
		
	}

	@Override
	public Student getStudent(int id) 
	{
		return dao.findById(id);
	}

	@Override
	public List<Student> getAllStudents()
	{
		List<Student> students= new ArrayList<>();
		dao.findAll().forEach(students::add);
		return students;
	}
		

}
