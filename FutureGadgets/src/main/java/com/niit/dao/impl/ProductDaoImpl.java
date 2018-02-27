package com.niit.dao.impl;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
public Product viewProduct(String productId) {
Criteria criteria =sessionFactory.openSession().createCriteria(Product.class);
criteria.add(Restrictions.eq("productId",Long.valueOf(productId)));
Product viewproduct= (Product)criteria.uniqueResult(); 
	return viewproduct;
}
public boolean addProduct(Product product) {
	// TODO Auto-generated method stub
	boolean flag=true;
	try
	{
	Session session =sessionFactory.openSession();
	session.saveOrUpdate(product);
	flag=true;
	session.flush();
	}
	catch(Exception w)
	{
		flag=false;
		}
	finally{return flag;}
}

}