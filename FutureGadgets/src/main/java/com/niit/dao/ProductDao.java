package com.niit.dao;

import com.niit.model.Product;
import java.util.List;
public interface ProductDao
 {
	 public List<Product>getAllProducts();
	 public Product viewProduct(String productId);
	 public boolean addProduct(Product product);
 }