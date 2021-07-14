package com.example.crud.springbootcrudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.springbootcrudoperation.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String productName);

}
