package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.GreetingsPreProcessor;

@Controller
public class GreetingsWebController {
	
	private GreetingsPreProcessor preProcessor;
	
	@Value("${welcome.message:Giordano}")
	private String welcomeMessage;
	
	@Autowired
	public GreetingsWebController(GreetingsPreProcessor preProcessor) {
		super();
		this.preProcessor = preProcessor;
	}


	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", preProcessor.preprocess(welcomeMessage));
		return "index";
	}
}
