package com.example.Helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value = "/hai", method = RequestMethod.GET)
	public String getWish() {
		return "Hello, Welcome to Cognizant";
		
	}

}
