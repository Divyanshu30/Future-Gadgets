package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ProductDao;
import com.niit.model.Product;
import com.niit.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService
{
@Autowired
ProductDao productDao;
public List<Product>getAllProducts()
{
	return productDao.getAllProducts();
	
}
}
