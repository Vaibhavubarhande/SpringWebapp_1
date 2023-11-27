package com.carnation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carnation.model.User;

@RestController
public class CommonController {

	@GetMapping("/msg")
	public String msg() {
		System.out.println("Welcome User");
		String s = new String();
		s = "Welcome User";
		
		return s;
	}
	@GetMapping("/user")
	public User usr() {
		User u = new User ();
		u.setId(1);
		u.setName("Vaibhav");
		u.setAddress("Pune");
		
		return u;
	}
	
}
