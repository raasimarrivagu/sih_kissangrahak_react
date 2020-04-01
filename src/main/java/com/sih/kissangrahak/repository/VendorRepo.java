package com.sih.kissangrahak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sih.kissangrahak.model.Vendor;

@Repository
public interface VendorRepo extends JpaRepository<Vendor, String> {
	
	

}
