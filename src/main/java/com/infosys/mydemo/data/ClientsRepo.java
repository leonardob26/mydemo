package com.infosys.mydemo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.mydemo.model.Client;

@Repository
public interface ClientsRepo extends JpaRepository<Client, Integer> {
	
}