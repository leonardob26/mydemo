package com.infosys.mydemo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.mydemo.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
}