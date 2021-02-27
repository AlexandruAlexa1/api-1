package com.aa.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aa.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Customer> findAll() {
		
		// get current hibernate session
		Session session = entityManager.unwrap(Session.class);
		
		// create a query
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		
		// execute query and get the result list
		List<Customer> customers = query.getResultList();

		// return the results
		return customers;
	}

	@Override
	public Customer findById(int id) {
		
		// get current hibernate session
		Session session = entityManager.unwrap(Session.class);
		
		// get customer by id
		Customer customer = session.get(Customer.class, id);
		
		// return customer
		return customer;
	}

	@Override
	public void save(Customer customer) {
		
		// get current hibernate session
		Session session = entityManager.unwrap(Session.class);
		
		// save customer
		session.saveOrUpdate(customer);

	}

	@Override
	public void deleteById(int id) {
		
		// get current hibernate session 
		Session session = entityManager.unwrap(Session.class);
		
		// create a query 
		Query<?> query = session.createQuery("delete from Customer where id=:employeeId");
		query.setParameter("employeeId", id);
		
		// execute update
		query.executeUpdate();

	}

}
