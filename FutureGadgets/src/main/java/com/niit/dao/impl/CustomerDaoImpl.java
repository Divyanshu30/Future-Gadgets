package com.niit.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CustomerDao;
import com.niit.model.Customer;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {

	
	private SessionFactory sessionFactory;
	public void addCustomer(Customer customer) {
		//Query query=sessionFactory.openSession().createQuery("insert into customer ");
		
	}
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		return null;
	}
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void removeCustomer(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
