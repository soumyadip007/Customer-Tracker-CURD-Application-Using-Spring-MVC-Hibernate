package com.project.spring.service;

import java.util.List;

import com.project.spring.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomerService();

	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int theID);

	public void deleteCustomer(int id);
}
