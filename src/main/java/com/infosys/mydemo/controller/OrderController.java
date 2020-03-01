package com.infosys.mydemo.controller;

import java.util.ArrayList;
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

import com.infosys.mydemo.data.OrdersRepo;
import com.infosys.mydemo.data.OrdersRepo.OrderWithData;
import com.infosys.mydemo.model.Orders;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrdersRepo repo;
	
	@GetMapping("/")
	public List<Orders> getOrder(){
		return repo.findAll();
	}
	
	@GetMapping("/allData")
	public List<OrderWithData> getOrderAllData(){
		List<OrderWithData> result;
		try {
			result = repo.orderWithDescription();
		} catch (Exception e) {
			result = new ArrayList<OrdersRepo.OrderWithData>();
		}
		return result;
	}
	
	@GetMapping("/{id}")
	public Optional<Orders> getOrder(@PathVariable("id") Integer id){
		return repo.findById(id);
	}
	
	@PostMapping("")
	public Orders addOrder(@RequestBody Orders order){
		return repo.save(order);
	}
	
	@PutMapping("")
	public Orders updOrder(@RequestBody Orders order){
		return repo.save(order);
	}
	
	@DeleteMapping("{id}")
	public boolean delOrder(@PathVariable("id") Integer id) {
		try {
			repo.deleteById(id);
			return true;
		} catch (Exception e) {

			return false;
		}
	}
	
	
}
