package com.nikhilcdac.restapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="candidate")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int roll;
	@Column
	private String name;
	@Column
	private String mobile;
	@Column
	private String address;
	
	public Candidate() {
		
	}
	
	public Candidate(int roll, String name, String mobile, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}
	
	public Candidate(int id ,int roll, String name, String mobile, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Candidate [roll=" + roll + ", name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	
	
	

}
