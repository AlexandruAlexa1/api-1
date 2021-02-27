package com.aa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aa.dao.CustomerDAO;
import com.aa.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public List<Customer> findAll() {
		
		return customerDAO.findAll();
	}

	@Override
	@Transactional
	public Customer findById(int id) {
		
		return customerDAO.findById(id);
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
