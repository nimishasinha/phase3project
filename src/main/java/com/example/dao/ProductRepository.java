package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByCategory(String category);

}
