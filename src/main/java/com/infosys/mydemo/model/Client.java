package com.infosys.mydemo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@Table(name="clients")
//@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	
	private String name;

	public Client() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}