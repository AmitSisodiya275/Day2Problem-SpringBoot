package com.bridgelab.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/home")
	public String sayHello() {
		return "hello";
	}
}
