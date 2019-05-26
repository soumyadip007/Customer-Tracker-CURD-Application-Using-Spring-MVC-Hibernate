package com.project.spring.dao;

import java.util.List;

import com.project.spring.entity.Customer;

public interface CustomerDAO {

	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	
	public Customer getCustomer(int theID);
}
