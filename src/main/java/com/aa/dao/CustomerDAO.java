package com.aa.dao;

import java.util.List;

import com.aa.entity.Customer;

public interface CustomerDAO {

	public List<Customer> findAll();
	
	public Customer findById(int id);
	
	public void save(Customer customer);
	
	public void deleteById(int id);
}
