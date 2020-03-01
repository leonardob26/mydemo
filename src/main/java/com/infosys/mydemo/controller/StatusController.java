package com.infosys.mydemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.mydemo.data.StatusRepo;
import com.infosys.mydemo.model.Status;

@RestController
@RequestMapping("/status")
public class StatusController {
	@Autowired
	StatusRepo repo;
	
	@GetMapping("/")
	public List<Status> getProducts(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Status> getStatus(@PathVariable("id") Integer id){
		return repo.findById(id);
	}
	
	@PostMapping("")
	public Status addStatus(@RequestBody Status status){
		return repo.save(status);
	}
	
	@PutMapping("")
	public Status updStatus(@RequestBody Status status){
		return repo.save(status);
	}
	
	@DeleteMapping("{id}")
	public boolean delStatus(@PathVariable("id") Integer id) {
		repo.deleteById(id);
		return true;
	}
	
	
}
