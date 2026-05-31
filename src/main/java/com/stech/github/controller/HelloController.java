package com.stech.github.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/github")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET,value = "/welcome")
	public String welcomeMethod() {
		return "<h1>Hello World!</h1>";
	}
	
}
