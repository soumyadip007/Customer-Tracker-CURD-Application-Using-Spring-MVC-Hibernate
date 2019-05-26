package com.project.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.spring.entity.Customer;

@Controller
public class index {

	
	@GetMapping("/")  //or @GetMapping
	public String listCustomers(Model theModel) {
	
		return "redirect:/customer/list";
	}
}
