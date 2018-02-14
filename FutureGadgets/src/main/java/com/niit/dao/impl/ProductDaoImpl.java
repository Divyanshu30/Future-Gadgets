package com.niit.dao.impl;

import java.util.*;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao
{
@Autowired
SessionFactory sessionFactory;
public List<Product> getAllProducts() 
{
	List<Product> allProducts=new ArrayList<Product>();
Query query=sessionFactory.openSession().createQuery("from Product");
allProducts=query.list();
return allProducts;
}

}