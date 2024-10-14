package com.nikhilcdac.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikhilcdac.restapi.entities.Student;
import com.nikhilcdac.restapi.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService sservice;
	//get all students 
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return sservice.getAllStudents();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id ) {
		return sservice.getStudent(id);
	}
}
