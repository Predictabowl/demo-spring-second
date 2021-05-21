package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingsServiceAltImpl implements GreetingsService {

	@Override
	public String getGreeting() {
		return "Luigi...";
	}

}
