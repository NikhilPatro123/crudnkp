package com.spring.Employee.entity;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Component
@AutoConfiguration
@Entity
public class Employee 
{
	@Id
	private int id;
	private int age;
	private String dob;
	private String f_name;
	private String l_name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public Employee(int id, int age, String dob, String f_name, String l_name) {
		super();
		this.id = id;
		this.age = age;
		this.dob = dob;
		this.f_name = f_name;
		this.l_name = l_name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", dob=" + dob + ", f_name=" + f_name + ", l_name=" + l_name
				+ "]";
	}
	
	
	
	
	
	
	
}
