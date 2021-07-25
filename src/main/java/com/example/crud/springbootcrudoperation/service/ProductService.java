package com.example.crud.springbootcrudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.springbootcrudoperation.entity.Product;
import com.example.crud.springbootcrudoperation.repository.FilterData;
import com.example.crud.springbootcrudoperation.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
	public Product saveProduct(Product product) {
		
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products) {
			
			return repository.saveAll(products);
		}

	public List<FilterData> getAllProduct() {
		
		return repository.findAllBy();
	}
	
	public Product getProductById(int productId) {
		
		return repository.findById(productId).orElse(null);
	}
	
	public FilterData getProductByName(String productName) {
			
			return repository.findByName(productName);
		}
	
	public String deleteProduct(int id) {
		
		 repository.deleteById(id);
		 
		 return "Product Deleted";
	}
	
	public Product updateProduct(Product product) {
		
		Product exisitngProduct=repository.findById(product.getId()).orElse(null);
		
		exisitngProduct.setName(product.getName());
		
		return repository.save(exisitngProduct);
	}




}
