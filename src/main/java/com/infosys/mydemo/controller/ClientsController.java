package com.infosys.mydemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.mydemo.data.ClientsRepo;
import com.infosys.mydemo.model.Client;;

@RestController
@RequestMapping("/client")
public class ClientsController {
	@Autowired
    private ClientsRepo clientRepo;
	@GetMapping("/")
	public List<Client> getAllCompany() {
		return clientRepo.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Client> getClient(@PathVariable("id") Integer id) {
		return clientRepo.findById(id);
		
	}
}
