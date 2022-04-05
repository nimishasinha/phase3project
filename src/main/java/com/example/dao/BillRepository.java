package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer> {

}
