package com.indus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.indus.entity.User;
import com.indus.service.UserI;
import com.indus.service.UserServiceImpl;

@RestController("/UserController  ")
public class UserController {

	@Autowired
	private UserServiceImpl service;
	
	
	@PostMapping("/register")
	//@ResponseBody
	public void registerUser( @RequestBody User user) {
		service.register(user); 
	}
	@GetMapping("/check")
	public String test() {
		return "hello";
		
	}
}
