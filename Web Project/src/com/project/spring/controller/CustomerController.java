package com.project.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.spring.entity.Customer;
import com.project.spring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject the customer dao
	@Autowired
	private CustomerService customerService;
	//private CustomerDAO customerDAO;
	
	@RequestMapping("/list")  //or @GetMapping
	public String listCustomers(Model theModel) {
		
		// get customers from the dao
		List<Customer> theCustomers = customerService.getCustomerService();
				
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "listcustomer";
	}
}