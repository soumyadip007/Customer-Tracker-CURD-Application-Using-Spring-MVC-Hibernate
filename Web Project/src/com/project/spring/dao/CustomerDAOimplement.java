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

	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;
				
		@Override
		@Transactional
		public List<Customer> getCustomers() {
			
			// get the current hibernate session
			Session currentSession = sessionFactory.getCurrentSession();
					
			// create a query
			Query<Customer> theQuery = 
					currentSession.createQuery("from customer", Customer.class);
			
			// execute query and get result list
			List<Customer> customers = theQuery.getResultList();
					
			// return the results		
			return customers;
		}

}
