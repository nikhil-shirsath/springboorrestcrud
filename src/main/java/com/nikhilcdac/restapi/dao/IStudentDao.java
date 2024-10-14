package com.nikhilcdac.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhilcdac.restapi.entities.Student;

public interface IStudentDao extends JpaRepository<Student, Integer>{

}
