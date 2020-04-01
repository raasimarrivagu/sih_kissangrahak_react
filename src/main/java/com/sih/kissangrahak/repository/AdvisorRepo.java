package com.sih.kissangrahak.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.sih.kissangrahak.model.Advisor;


@Repository
public interface AdvisorRepo extends JpaRepository<Advisor,String>{
	List<Advisor> findAllByName(String name);
	List<Advisor> findAllByJob(String job);
	List<Advisor> findAllByAreaOfExpertise(String areaOfExpertise);
}
