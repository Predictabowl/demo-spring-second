package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingsConfig {
	
	@Bean
	public GreetingsService greetingsService(GreetingsPreProcessor preProcessor) {
		return new GreetingsServiceDefaultImpl(preProcessor);
	}
}
