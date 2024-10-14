package com.nikhilcdac.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhilcdac.restapi.dao.IStudentDao;
import com.nikhilcdac.restapi.entities.Student;

@Service
public class StudentService {
	@Autowired
	private IStudentDao sdao;
	
	

	public List<Student> getAllStudents() {
		List<Student> lst = sdao.findAll();
		return lst;
	}



	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Student s = sdao.findById(id).get();
		if(s!=null) {
			return s;
		}else {
			return null;
		}
	}

}
