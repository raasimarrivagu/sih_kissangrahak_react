package com.sih.kissangrahak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="advisor")
public class Advisor {
	
	@Id
	@NotNull
	@Column(updatable=false)
	String aadhar;
	@NotNull
	@Column(updatable=false)
	String name;
	@NotNull
	String areaOfExpertise;
	@NotNull
	String qualification;
	@NotNull
	String job;
	@NotNull
	String password;
	@NotNull
	String email;
	@NotNull
	String contactNo;
	@NotNull
	String availability;
	
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAreaOfExpertise() {
		return areaOfExpertise;
	}
	public void setAreaOfExpertise(String areaOfExpertise) {
		this.areaOfExpertise = areaOfExpertise;
	}
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	

}
