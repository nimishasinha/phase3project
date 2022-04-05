package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productId;
	private String orderName;
	private String orderPrice;
	private String customerName;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(String productId, String orderName, String orderPrice, String customerName) {
		super();
		this.productId = productId;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
		this.customerName = customerName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", productId=" + productId + ", orderName=" + orderName + ", orderPrice=" + orderPrice
				+ ", customerName=" + customerName + "]";
	}
	
	

}
