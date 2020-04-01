package com.sih.kissangrahak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sih.kissangrahak.model.Post;

public interface PostRepo extends JpaRepository<Post, Long> {

	List<Post> findAllByOrderByPostUpdatedOnDesc();
}
