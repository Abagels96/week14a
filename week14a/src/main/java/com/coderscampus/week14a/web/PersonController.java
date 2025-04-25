package com.coderscampus.week14a.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.week14a.DTO.Person;
import com.coderscampus.week14a.repository.PersonRepository;


@RestController
public class PersonController {
	
	@Autowired
PersonRepository personRepo;
@PostMapping("/persons")
public Person createPersons( String name,  Integer age,	 String gender,Long Id) {
	Person person= new Person();
	person.setName(name);
	person.setAge(age);
	person.setGender(gender);
	person.setId(Id);
	personRepo.save(person);
			
	
	
	return person;
	
}
//fetches the person with Id #1
//http:localhost:8080/persons/1

@GetMapping("/persons/{personId}")
public Person getPerson(@PathVariable Long personId) {
	System.out.println("Person Id is: "+personId);
	return personRepo.findById(personId);
	
	
}

}
