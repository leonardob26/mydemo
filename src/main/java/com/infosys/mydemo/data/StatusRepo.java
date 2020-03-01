package com.infosys.mydemo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.mydemo.model.Status;

@Repository
public interface StatusRepo extends JpaRepository<Status, Integer> {
	
}