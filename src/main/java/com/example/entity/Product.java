package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productName;
	private String category;
	private Long price;
	
	/*
	 * @ManyToMany private List<Order> order = new ArrayList();
	 */

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, String category, Long price) {
		super();
		this.productName = productName;
		this.category = category;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	/*
	 * public List<Order> getOrder() { return order; }
	 * 
	 * public void setOrder(List<Order> order) { this.order = order; }
	 */

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", category=" + category + ", price=" + price
				+  "]";
	}
	
	
	
	

}
