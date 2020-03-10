package com.infosys.mydemo.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/hello2")
public class HelloController2 {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/persons")
	public Person index() {
		return new Person(2, "Jaja ", "No Address");
	}
	
	@GetMapping("/persons/{id}")
	public List<Person> personas(@PathVariable("id") Integer id) {
	    Person p = restTemplate.getForObject("http://localhost:8081/hello2/persons", Person.class);
	    
	    List persons = new ArrayList<Person>();
	    persons.add(p);
	    
		for(int i=0; i<10; i++) {
			Person per = new Person(i, "Name " + i + id, "Address " + i + id);
			persons.add(per);
		}
		return persons;
	}
	@PostMapping("/persons")
	public String personas(@RequestBody Person per) {
		return per.getName();
	}
	@DeleteMapping("/persons/{myid}")
	public String personasD(@PathVariable("myid") Integer id) {
		try {
			Random rd = new Random();
			return String.valueOf(rd.nextInt()%2 == 0) + " " + id;
		} catch (Exception e) {
			return " " + e.getMessage();
		} finally {
			System.out.println("JAJAJAJA");
		}
	}

}