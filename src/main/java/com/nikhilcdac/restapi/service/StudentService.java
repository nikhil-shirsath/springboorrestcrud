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



	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Student std  = new Student();
		System.out.println(student.getStudent_name());
		std.setStudent_name(student.getStudent_name());
		std.setStudent_branch(student.getStudent_branch());
		std.setStudent_percentage(student.getStudent_percentage());
		return sdao.save(std);
	}



	public Student updateStudent(int id, Student st) {
		// TODO Auto-generated method stub
		
		Student student = getStudent(id);
		if(student!=null) {
			student.setStudent_name(st.getStudent_name());
			student.setStudent_branch(st.getStudent_branch());
			student.setStudent_percentage(st.getStudent_percentage());
			sdao.save(student);
			return student;
		}
		return null;
	}



	public Student deleteStudent(int id) {
		// TODO Auto-generated method stub
		Student st = getStudent(id);
		if(st!=null) {
			sdao.delete(st);
			return st;
		}
		return null;
	}

}
