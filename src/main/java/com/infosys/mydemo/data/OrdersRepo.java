package com.infosys.mydemo.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.mydemo.model.Orders;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer> {
	
	@Query(value="select o.ID orderId, date_delivery dateDelivery, date_get_paid dateGetPaid, date_order dateOrder, DEEP, HEIGHT, o.PRICE orderPrice, " +
			"QUANTITY, WIDTH, c.name clientsName, p.name productsName, user_id, s.name statusName " + 
			"from orders o join clients c on (o.clients_id=c.id) " + 
			"join products p on (o.products_id=p.id) " + 
			"join status s on (o.status_id=s.id)", nativeQuery = true)
	List<OrderWithData> orderWithDescription();
	
	@Query(value="select o.ID orderId, date_delivery dateDelivery, date_get_paid dateGetPaid, date_order dateOrder, DEEP, HEIGHT, o.PRICE orderPrice, " +
			"QUANTITY, WIDTH, c.name clientsName, p.name productsName, user_id, s.name statusName " + 
			"from orders o join clients c on (o.clients_id=c.id) " + 
			"join products p on (o.products_id=p.id) " + 
			"join status s on (o.status_id=s.id)", nativeQuery = true)
	List<OrderWithData> orderWithDescriptionByClients();
	
	interface OrderWithData{
		String getOrderId();
		long getDateDelivery();
		long getDateGetPaid();
		long getDateOrder();
		String getDeep();
		String getHeight();
		String getOrderPrice();
		String getQuantity();
		String getWidth();
		String getClientsName();
		String getProductsName();
		String getStatusName();
	}
}
