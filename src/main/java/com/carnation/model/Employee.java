package com.carnation.model;


public class Employee {
	
	private int id;
	private String firstname;
	private String lastname;
	private String dept;
	private int salary;
	private int mobile;
	
	public Employee() {
		
	}
	public Employee(int id, String firstname, String lastname, String dept, int salary, int mobile) {
		
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dept = dept;
		this.salary = salary;
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	

}
