package com.nikhilcdac.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nikhilcdac.restapi.entities.Student;
import com.nikhilcdac.restapi.service.StudentService;
import org.springframework.web.bind.annotation.PutMapping;


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
	
	@PostMapping("/student/add")
	public Student  addStudent(@RequestBody Student student) {
		return sservice.addStudent(student);
	}
	
	@PutMapping("student/update/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student ) {
		//TODO: process PUT request
		return  sservice.updateStudent(id,student);
		
	}
	
	@DeleteMapping("/student/delete/{id}")
	public Student deleteStudent(@PathVariable int id) {
		return sservice.deleteStudent(id);
	}
}
