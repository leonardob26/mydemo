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

import com.infosys.mydemo.data.ProductRepo;
import com.infosys.mydemo.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductRepo repo;
	
	@GetMapping("/")
	public List<Product> getProducts(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getProduct(@PathVariable("id") Integer id){
		return repo.findById(id);
	}
	
	@PostMapping("")
	public Product addProduct(@RequestBody Product product){
		return repo.save(product);
	}
	
	@PutMapping("")
	public Product updProduct(@RequestBody Product product){
		return repo.save(product);
	}
	
	@DeleteMapping("{id}")
	public boolean delProduct(@PathVariable("id") Integer id) {
		repo.deleteById(id);
		return true;
	}
	
	
}
