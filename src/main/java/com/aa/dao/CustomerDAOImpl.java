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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

}
