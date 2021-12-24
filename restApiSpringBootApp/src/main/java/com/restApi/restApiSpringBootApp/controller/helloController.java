package com.restApi.restApiSpringBootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
	
	@GetMapping("/helloWorld/string")
	@ResponseBody
	public String helloWorldString() {
		return "hello";
	}
	
}
