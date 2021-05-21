package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingsPreProcessorImpl implements GreetingsPreProcessor {

	@Override
	public String preprocess(String greeting) {
		return "(preprocessed) "+greeting;
	}

}
