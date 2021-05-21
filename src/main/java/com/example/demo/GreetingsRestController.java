package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.GreetingsService;

@RestController
public class GreetingsRestController {

	private GreetingsService greetingsService;
	
	@Autowired
	public GreetingsRestController(GreetingsService greetingsService) {
		this.greetingsService = greetingsService;
	}

	@GetMapping("/hi")
	public String sayHi() {
		return greetingsService.getGreeting();
	}
}
