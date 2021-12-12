package com.bridgelab.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloWorldRestController {

	@RequestMapping(value = {"", "/", "/home"})
	public String sayHello() {
		return "<h1>Hello From Rest Controller</h1>";
	}
}
