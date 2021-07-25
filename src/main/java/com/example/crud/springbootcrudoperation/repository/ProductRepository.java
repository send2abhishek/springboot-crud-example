package com.example.crud.springbootcrudoperation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




import com.example.crud.springbootcrudoperation.entity.Product;



public interface ProductRepository extends JpaRepository<Product, Integer> {

public FilterData findByName(String productName);


public List<FilterData> findAllBy();

}
