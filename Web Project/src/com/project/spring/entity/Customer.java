package com.project.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="first_name")
	private String firstname;
	
	
	@Column(name="last_name")
	private String lastname;
	
	
	@Column(name="email")
	private String email;
	
	
	public Customer()
	{
		
	}
	
}
