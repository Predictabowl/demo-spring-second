package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@RestController
@RequestMapping("/persons")
public class PersonRestController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping
	public List<Person> all(){
		return personRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Person> one(@PathVariable long id){
		return personRepository.findById(id);
	}
	
	@GetMapping("/lastname/{id}")
	public List<Person> byLastName(@PathVariable("id") String lastName){
		return personRepository.findByLastNameOrderByFirstName(lastName);
	}
}
