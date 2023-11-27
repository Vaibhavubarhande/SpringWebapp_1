package com.carnation.service;

import org.springframework.stereotype.Service;

import com.carnation.model.Employee;

@Service  //Chef
public class EmployeeService {
	
	public Employee emp() {
		
		Employee e = new Employee(1, "Hello Anarkali", "Borse", "Disco", 120, 7676);
		return e;
	}
}
