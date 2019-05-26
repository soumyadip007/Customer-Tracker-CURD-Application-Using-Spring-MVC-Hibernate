package com.project.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.spring.entity.Customer;

@Repository
public class CustomerDAOimplement implements CustomerDAO {

	@Autowired
	private SessionFactory sessionfactory;
	
	
	@Override
	@Transactional
	public List<Customer> getCustomer() {
		
		
		//get the current hibernate session
		Session session=(Session) sessionfactory.getSessionFactory();
		
		
		//Create query
		Query<Customer> query=session.createQuery("form customer",Customer.class);
		
	
		//execute
		List<Customer> customer=query.getResultList();
		
		
		
		//return the result
		return customer;
		
	
	}

}
