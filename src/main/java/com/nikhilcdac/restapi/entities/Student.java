package com.nikhilcdac.restapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_rno;
	@Column
	private String student_name;
	@Column
	private float student_percentage;
	@Column
	private String student_branch;
	
	public Student() {
		
	}
	

	public Student(String student_name, float student_percentage, String student_branch) {
		super();
		this.student_name = student_name;
		this.student_percentage = student_percentage;
		this.student_branch = student_branch;
	}


	public int getStudent_rno() {
		return student_rno;
	}

	public void setStudent_rno(int student_rno) {
		this.student_rno = student_rno;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public float getStudent_percentage() {
		return student_percentage;
	}

	public void setStudent_percentage(float student_percentage) {
		this.student_percentage = student_percentage;
	}

	public String getStudent_branch() {
		return student_branch;
	}

	public void setStudent_branch(String student_branch) {
		this.student_branch = student_branch;
	}

	@Override
	public String toString() {
		return "Student [student_rno=" + student_rno + ", student_name=" + student_name + ", student_percentage="
				+ student_percentage + ", student_branch=" + student_branch + "]";
	}
	
	

}
