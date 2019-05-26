package com.project.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.spring.entity.Customer;
import com.project.spring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject the customer dao
	@Autowired
	private CustomerService customerService;
	//private CustomerDAO customerDAO;
	
	@GetMapping("/list")  //or @GetMapping
	public String listCustomers(Model theModel) {
		
		// get customers from the dao
		List<Customer> theCustomers = customerService.getCustomerService();
				
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "listcustomer";
	}
	
	@RequestMapping("/showFormForAdd")  //or @GetMapping
	public String showFormForAdd(Model theModel) {
		
		Customer theCustomer=new Customer();
		
		theModel.addAttribute("customer",theCustomer);
		
		return "customerForm";
	}
	
	@PostMapping("/saveForm")  
	public String saveForm(@ModelAttribute("customer") Customer theCustomer) {
		
		
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
	}
	
	
	@GetMapping("/showFormForUpdate") 
	public String showFormForUpdate(@RequestParam("customerID") int id,Model theModel) {
		
		Customer theCustomer = customerService.getCustomer(id);
		
		theModel.addAttribute("customer",theCustomer);
		
		return "customerForm";
	}
	
	
	
	@GetMapping("/delete") 
	public String delete1(@RequestParam("customerID") int id,Model theModel) {
		
		
		//Delete the customer
		System.out.println("ID is "+id);
		
		customerService.deleteCustomer(id);
		
		return "redirect:/customer/list";
	}
	
	
	
}