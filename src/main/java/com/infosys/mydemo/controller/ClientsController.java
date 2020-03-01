package com.infosys.mydemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.mydemo.data.ClientsRepo;
import com.infosys.mydemo.model.Client;;

@RestController
@RequestMapping("/company")
public class ClientsController {
	@Autowired
    private ClientsRepo companyRepo;
	@GetMapping("/")
	public List<Client> getAllCompany() {
		return companyRepo.findAll();
	}
}
