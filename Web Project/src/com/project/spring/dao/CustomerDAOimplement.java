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
					currentSession.createQuery("from Customer order by firstName", Customer.class);
			
			// execute query and get result list
			List<Customer> customers = theQuery.getResultList();
					
			// return the results		
			return customers;
		}

		@Override
		@Transactional
		public void saveCustomer(Customer theCustomer) {
			
			
			// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
								
			// create a query
				currentSession.saveOrUpdate(theCustomer);
				
				
		}

		@Override
		@Transactional
		public Customer getCustomer(int theID) {
			
			// get the current hibernate session
			Session currentSession = sessionFactory.getCurrentSession();
		
			//get the id
			Customer theCustomer=currentSession.get(Customer.class,theID);
			
			return theCustomer;
		}

		@Override
		public void deleteCustomer(int id) {
		

			// get the current hibernate session
			Session currentSession = sessionFactory.getCurrentSession();
		
			
			//delete the id
			Query theQuery=currentSession.createQuery("delete from Customer where if=:theID");
			theQuery.setParameter("theID",id);
			
			theQuery.executeUpdate();

		//	Customer theCustomer=currentSession.get(Customer.class,id);

		//	System.out.println("Geting Customer\n :");
			
			//currentSession.delete(theCustomer);
			
		}
		

	}
