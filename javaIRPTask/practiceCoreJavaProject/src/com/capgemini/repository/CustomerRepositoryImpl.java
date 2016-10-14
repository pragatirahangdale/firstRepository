package com.capgemini.repository;

import java.util.List;

import com.capgemini.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepositoryIF {

List <Customer> customers = null;
	
	public List <Customer> findAllCustomers(){
		Customer c1 = new Customer();
		Customer c2  = new Customer();
		
		c1.setAccountNo("1001");
		c1.setCustId("C101");
		c1.setCustName("Pragati");
		c1.setCustAddr("Pune");
		c1.setCustMobile("9999999999");
		
		c1.setAccountNo("1002");
		c1.setCustId("C102");
		c1.setCustName("Pranita");
		c1.setCustAddr("Banglore");
		c1.setCustMobile("9999988888"); 
		
		customers.add(c1);
		customers.add(c2);
		return customers;
	}
}
