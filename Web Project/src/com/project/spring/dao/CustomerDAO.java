package com.project.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.spring.entity.Customer;

public interface CustomerDAO {

	@Autowired
	public List<Customer> getCustomer();
}
