package com.niit.service;

import java.util.List;

import com.niit.model.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product viewProduct(String productId);
	public boolean addProduct(Product product);
}
