package com.wzc.springBootTest.controller;

//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//	@RequestMapping("/user")
//	public String getUser(Authentication auth) {
//		// spring boot 获取当前用户
//		User user = (User)auth.getPrincipal();
//		
//		return "hello";
//	}
	
	@RequestMapping("/user")
	public String getUser() {
		// spring boot 获取当前用户
		
		return "hello";
	}
}
