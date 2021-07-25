package com.example.crud.springbootcrudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.springbootcrudoperation.entity.Product;
import com.example.crud.springbootcrudoperation.repository.FilterData;
import com.example.crud.springbootcrudoperation.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		
		return service.saveProduct(product);
		
	}
	
	@PostMapping("/products")
	public List<Product> addAllProduct(@RequestBody List<Product> products) {
			
			return service.saveProducts(products);
			
		}
	
	@GetMapping("/products")
	public List<FilterData> findAllProducts(){
		
		return service.getAllProduct();
	}
	@GetMapping("/products/{productId}")
	public Product findProduct(@PathVariable int productId) {
			return service.getProductById(productId);
	}
	
	@GetMapping("/product/{productName}")
	public FilterData findProductByName(@PathVariable String productName) {
		return service.getProductByName(productName);
	}
	
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
			
			return service.updateProduct(product);
			
		}
	
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable int id) {
		
		return service.deleteProduct(id);
	}
}
