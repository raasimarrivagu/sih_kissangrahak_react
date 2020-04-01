package com.sih.kissangrahak.model;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

import lombok.NonNull;

@Entity
@Table(name="vendor")
public class Vendor {

	@Id
	String id;
	@NonNull
	String name;
	@NonNull
	String address;
	@NonNull
	String email;
	@NonNull
	String contactNo;
	@NonNull
	String password;
	@NonNull
	String services;
	@NonNull
	String websiteLink;
	
	@ElementCollection
	@MapKeyColumn(name="service")
	@Column(name="price")
	@CollectionTable(name="pricing_table",joinColumns=@JoinColumn(name="id"))
	Map<String,String> pricing;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

		public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getWebsiteLink() {
		return websiteLink;
	}

	public void setWebsiteLink(String websiteLink) {
		this.websiteLink = websiteLink;
	}

	public Map<String, String> getPricing() {
		return pricing;
	}

	public void setPricing(Map<String, String> pricing) {
		this.pricing = pricing;
	}
	
	
	
}
