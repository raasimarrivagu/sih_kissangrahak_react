package com.sih.kissangrahak.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sih.kissangrahak.model.Advisor;
import com.sih.kissangrahak.repository.AdvisorRepo;


@RestController
@CrossOrigin
@RequestMapping("/advisor")
public class AdvisorController {
	
	@Autowired
	AdvisorRepo advisorRepo;

	@GetMapping("/get_advisors")
	public List<Advisor> getAllAdvisors(){
		return advisorRepo.findAll();
	}
	
	@PostMapping("/register_advisor")
	public Advisor createAdvisor(@RequestBody Advisor advisor){
		if(!advisorRepo.existsById(advisor.getAadhar())){
			
		}		
		return advisorRepo.save(advisor);
	}
	
	@PutMapping("/update_advisor_details")
	public Advisor updateAdvisor(@RequestBody Advisor advisor){
		if(!advisorRepo.existsById(advisor.getAadhar())){
		
		}
		Optional<Advisor> advisorOptional = advisorRepo.findById(advisor.getAadhar());
		Advisor updatedAdvisor = advisorOptional.get();
		updatedAdvisor.setAreaOfExpertise(advisor.getAreaOfExpertise());
		updatedAdvisor.setQualification(advisor.getQualification());
		updatedAdvisor.setJob(advisor.getJob());
		
		return advisorRepo.save(updatedAdvisor);
	}
	
	@GetMapping("/get_advisor_by_name/{advisor_name}")
	public List<Advisor> getAdvisorByName(@PathVariable(name="advisor_name") String advisorName){
		return advisorRepo.findAllByName(advisorName);
	}
	

	@GetMapping("/get_advisor_by_job/{advisor_job}")
	public List<Advisor> getAdvisorByJob(@PathVariable(name="advisor_job") String advisorJob){
		return advisorRepo.findAllByJob(advisorJob);
	}

	@GetMapping("/get_advisor_by_aoe/{advisor_aoe}")
	public List<Advisor> getAdvisorByAOE(@PathVariable(name="advisor_aoe") String advisorAOE){
		return advisorRepo.findAllByName(advisorAOE);
	}
}
