package com.niit.dao;

import java.util.List;

import com.niit.model.Customer;

public interface CustomerDao {
	
	
	public void addCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
	public List<Customer> listCustomer();
	
	public Customer getCustomerById(int id);
	
	public void removeCustomer(int id);

}
