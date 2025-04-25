package com.coderscampus.week14a.service;

import org.junit.jupiter.api.Test;

import com.coderscampus.week14a.DTO.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample {
	
	
// JSON javascript object notation
// a string based way to notate data
//key:value pairs
//key:value pairs separated by commas
//objects are represented by {}
//		and arrays represented by[]
	
// JSON is language agnostic it is not tied to javascript(work in any language)
//	
// Person: name,age,gender;
//	{
//		"name" : "Trevor Page",
//		 "age": 37, "gender": "Male"
//			
//			
//	}
	
//List<Person> people
	
//	[]
//	{
//		"name" : "Trevor Page",
//		 "age": 37, "gender": "Male"
//			
//			
//	}
//	 ,
//	 {"name": "Jane Doe",
//		 "age": 29,
//		 "gender":"female"
//		 
//	 }

//// XML
//<people> 
//	<person>
//		<name>Trevor Page</name>
//		<age>37</age>
//		<gender>Male</gender>
//		</person>
////	 <person>
//		<name>Jane Doe</name>
//        <age>29	</age>
//        <gender>Female</gender>
//</person>
//</people>
//	 
//	 ]
			

@Test
public void convertJavaObjectToJson() {
	String jsonString = "{\"name\": \"John Doe\", \"age\": 37, \"gender\":\"Male\"}";	

ObjectMapper mapper= new ObjectMapper();

try {
	Person person= mapper.readValue(jsonString, Person.class);
	celebrateBirthday(person);

	
	System.out.println(mapper.writeValueAsString(person));
//	System.out.println(mapper.writeValueAsString(person));
	
} catch (JsonMappingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (JsonProcessingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//private void celebrateBirthday(Person person) {
//	person.setAge(person.getAge()+1);
//	
//}

}

public void celebrateBirthday(Person person) {
	person.setAge(person.getAge()+1);
}
	
}

