package com.sih.kissangrahak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sih.kissangrahak.model.Customer;
import com.sih.kissangrahak.repository.CustomerRepo;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepo customerRepo;

	@GetMapping("/get_customers")
	public List<Customer> getAllCustomers(){
		return customerRepo.findAll();
	}
	
	@PostMapping("/register_customer")
	public Customer createCustomer(@RequestBody Customer customer){
		if(customerRepo.existsById(customer.getAadhar())){
			
		}
		return customerRepo.save(customer);
	}
	
	
}
