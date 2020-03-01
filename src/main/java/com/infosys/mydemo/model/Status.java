package com.infosys.mydemo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the status database table.
 * 
 */
@Entity
@Table(name="status")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int isOrder;

	private int isService;

	private String name;

	public Status() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsOrder() {
		return this.isOrder;
	}

	public void setIsOrder(int isOrder) {
		this.isOrder = isOrder;
	}

	public int getIsService() {
		return this.isService;
	}

	public void setIsService(int isService) {
		this.isService = isService;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}