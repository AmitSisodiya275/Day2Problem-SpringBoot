package com.bridgelab.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping(value = {"/","/home"})
	public String sayHello() {
		return "hello";
	}

	@GetMapping("/home/message")
	public String message(Model model) {
		model.addAttribute("message", "This is custom message from Amit Sisodiya");
		return "message";
	}
}
