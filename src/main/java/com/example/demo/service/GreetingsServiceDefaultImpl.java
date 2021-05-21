package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class GreetingsServiceDefaultImpl implements GreetingsService {

	private GreetingsPreProcessor preProcessor;
	
	@Autowired
	public GreetingsServiceDefaultImpl(GreetingsPreProcessor preProcessor) {
		this.preProcessor = preProcessor;
	}


	@Override
	public String getGreeting() {
		return preProcessor.preprocess("Mario!");
	}

}
