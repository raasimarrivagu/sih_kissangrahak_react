package com.sih.kissangrahak.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="farmer")
@JsonIgnoreProperties(value="posts",allowGetters=true)
public class Farmer {
	
	@Id
	@PrimaryKeyJoinColumn
	String aadhar;
	
	@NotNull
	int name;
	
	@NotNull
	String email;
	
	@NotNull
	String password;
	
	@NotNull
	String cropsGrown;
	
	@NotNull
	String address;
	
	@OneToMany(targetEntity=Post.class)
	Set<Post> posts;
	
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
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
	public String getCropsGrown() {
		return cropsGrown;
	}
	public void setCropsGrown(String cropsGrown) {
		this.cropsGrown = cropsGrown;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Set<Post> getPosts() {
		return posts;
	}
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}
	

}
