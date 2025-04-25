package com.coderscampus.week14a.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.coderscampus.week14a.DTO.Person;

@Repository
public class PersonRepository {
	
	private Map<Long, Person> personsData= new HashMap<>();
	
	
	
	
	public void save(Person person) {
		personsData.put(person.getId(), person);
	}
	
	
	public Person findById(Long personId) {
		return personsData.get(personId);
		
	}

}
