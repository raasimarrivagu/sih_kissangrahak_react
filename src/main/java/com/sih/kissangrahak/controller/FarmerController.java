package com.sih.kissangrahak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sih.kissangrahak.model.Farmer;
import com.sih.kissangrahak.repository.FarmerRepo;

@RestController
public class FarmerController {

	@Autowired
	FarmerRepo farmerRepo;
	
	@GetMapping("/getAllFarmers")
	public List<Farmer> getAllFarmer(){
		return farmerRepo.findAll();
	}
	
	@PostMapping("/registerFarmer")
	public Farmer createFarmer(@RequestBody Farmer farmer){
		return farmerRepo.save(farmer);
	}
}
