package com.project.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.spring.dao.CustomerDAO;
import com.project.spring.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//Inject the DAO into the controller
	
	@Autowired
	private CustomerDAO customerDAO;
		
	
	@RequestMapping("/list")
	public String listCustomer(Model theModel)
	{
		
		//get the customer from the DAO
		List<Customer> theCustomer=customerDAO.getCustomer();
		
		
		//Add customer to model
		theModel.addAttribute("customer",theCustomer);
		
		
		
		return "listcustomer";
	}
}