package com.infosys.mydemo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the orders database table.
 * 
 */
@Entity
@Table(name="orders")
//@NamedQuery(name="Orders.findAll", query="SELECT o FROM Orders o")
public class Orders implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private long dateDelivery;
	private long dateGetPaid;
	private long dateOrder;
	
	private float deep;

	private float height;

	private float price;

	private short quantity;

	private float width;

	private int clientsId;

	private int productsId;

	private int statusId;

	private int userId;
	
	public Orders() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getDateDelivery() {
		return this.dateDelivery;
	}

	public void setDateDelivery(long dateDelivery) {
		this.dateDelivery = dateDelivery;
	}

	public long getDateGetPaid() {
		return this.dateGetPaid;
	}

	public void setDateGetPaid(long dateGetPaid) {
		this.dateGetPaid = dateGetPaid;
	}

	public long getDateOrder() {
		return this.dateOrder;
	}

	public void setDateOrder(long dateOrder) {
		this.dateOrder = dateOrder;
	}

	public float getDeep() {
		return this.deep;
	}

	public void setDeep(float deep) {
		this.deep = deep;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public short getQuantity() {
		return this.quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

	public float getWidth() {
		return this.width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public int getClientsId() {
		return clientsId;
	}

	public void setClientsId(int clientsId) {
		this.clientsId = clientsId;
	}

	public int getProductsId() {
		return productsId;
	}

	public void setProductsId(int productsId) {
		this.productsId = productsId;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getSecUserId() {
		return userId;
	}

	public void setSecUserId(int secUserId) {
		this.userId = secUserId;
	}
}