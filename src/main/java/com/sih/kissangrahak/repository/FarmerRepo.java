package com.sih.kissangrahak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sih.kissangrahak.model.Farmer;

@Repository
public interface FarmerRepo extends JpaRepository<Farmer, String>{

}
