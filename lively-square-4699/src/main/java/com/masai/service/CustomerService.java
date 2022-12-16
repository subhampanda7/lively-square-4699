package com.masai.service;

import java.util.List;

import com.masai.exceptions.CustomerException;
import com.masai.model.Customer;
import com.masai.model.Restaurant;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer)throws CustomerException;
	
	public Customer updateCustomer(Customer customer, String key)throws CustomerException;
	
	public Customer removeCustomer(Integer customerId, String key)throws CustomerException;
	
	public Customer viewCustomer(Integer customerId)throws CustomerException;
	
	
//	public List<Customer> viewAllCustomers(Restaurant restaurant)throws CustomerException,RestaurantException;

}