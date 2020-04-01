package com.sih.kissangrahak.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sih.kissangrahak.model.Post;
import com.sih.kissangrahak.repository.FarmerRepo;
import com.sih.kissangrahak.repository.PostRepo;

@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostRepo postRepo;
	
	@Autowired
	FarmerRepo farmerRepo;
	
	@GetMapping("/get_posts")
	public List<Post> getAllPosts(){
		return postRepo.findAllByOrderByPostUpdatedOnDesc();
	}
	
	@PostMapping("/createPost")
	public Post createPost(@RequestBody Map<String,String> addPost){
		Post post=new Post();
		post.setDescription(addPost.get("description"));
		post.setFarmer(farmerRepo.findById(addPost.get("username")).get());
		post.setQuantity(addPost.get("quantity"));
		post.setTitle(addPost.get("title"));
		return postRepo.save(post);
	}
	
	@PutMapping("/updatePost")
	public Post updatePost(@RequestBody Map<String,String> updateContent){
		return new Post();
	}
	
}
