package com.sih.kissangrahak.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sih.kissangrahak.repository.AdvisorRepo;
import com.sih.kissangrahak.repository.CustomerRepo;
import com.sih.kissangrahak.repository.FarmerRepo;
import com.sih.kissangrahak.repository.VendorRepo;

@RestController
@RequestMapping("/login")
public class CommonController {
	
	@Autowired
	private AdvisorRepo advisorRepo;
	
	@Autowired
	private VendorRepo vendorRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private FarmerRepo farmerRepo;
	
	@GetMapping("/verify_user")
	public String getLoginCredentials(@RequestBody Map<String,String> credentials){
		String username=credentials.get("username");
		String password=credentials.get("password");
		if(farmerRepo.existsById(username)){
			if(password.equals(farmerRepo.findById(username))){
				return "farmer";
			}
		}
		if(customerRepo.existsById(username)){
			if(password.equals(customerRepo.findById(username))){
				return "customer";
			}
		}
		if(vendorRepo.existsById(username)){
			if(password.equals(vendorRepo.findById(username))){
				return "vendor";
			}
		}
		if(advisorRepo.existsById(username)){
			if(password.equals(advisorRepo.findById(username))){
				return "advisor";
			}
		}
		return "invalid customer";
	}
	

}
