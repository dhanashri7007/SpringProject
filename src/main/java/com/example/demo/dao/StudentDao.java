package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
	public interface StudentDao extends CrudRepository<Student, Integer>{
	
	Student findById(int id); 

}
