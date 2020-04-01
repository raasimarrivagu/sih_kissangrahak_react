package com.sih.kissangrahak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sih.kissangrahak.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {

}
