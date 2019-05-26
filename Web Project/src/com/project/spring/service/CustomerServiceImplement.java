package com.project.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.spring.dao.CustomerDAO;
import com.project.spring.entity.Customer;

@Service
public class CustomerServiceImplement implements CustomerService {

	@Autowired
	private CustomerDAO  customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomerService() {
		
		return customerDAO.getCustomers();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		
		
		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	public Customer getCustomer(int theID) {
		
		
		
		return customerDAO.getCustomer(theID);
	}

	@Override
	public void deleteCustomer(int id) {
	
		customerDAO.deleteCustomer(id);
	}

}
