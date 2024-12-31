package com.ty.social_talk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//import com.ty.social_talk.dto.User;

@Controller
public class AppController {
	@GetMapping({"/","/login"})
	public String loadLogin() {
		return "login.html";
	}
	
	@GetMapping("/register")
	public String loadRegister() {
		return "register.html";
	}
	
//	@PostMapping("/register")
//	public String register(User user) {
//		return "redirect:https://youtube.com";
//	}
}
