package com.curd.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/customer")
public class CustomerController {

	
	@RequestMapping("/")
	public String listcustomer(Model theModel)
	{
		
		return "list-customer";
		
	}
}
