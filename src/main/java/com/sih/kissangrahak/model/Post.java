package com.sih.kissangrahak.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.NonNull;

@Entity
@Table(name="post")
@JsonIgnoreProperties(value={"postCreatedOn","postUpdatedOn"},allowGetters=true)
public class Post {

	@Id
	@PrimaryKeyJoinColumn
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@NonNull
	String title;
	
	@ManyToOne
	Farmer farmer;
	
	//price per kg
	@NonNull
	Float price;
	
	@NonNull
	String description;
	
	//weight in kgs
	@NonNull
	String quantity;
	
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=false,nullable=false)
	Date postCreatedOn;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=true,nullable=false)
	Date postUpdatedOn;
	
	@Temporal(TemporalType.TIMESTAMP)
	Date cropProducedOn;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Farmer getFarmer() {
		return farmer;
	}
	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Date getPostCreatedOn() {
		return postCreatedOn;
	}
	public void setPostCreatedOn(Date postCreatedOn) {
		this.postCreatedOn = postCreatedOn;
	}
	public Date getPostUpdatedOn() {
		return postUpdatedOn;
	}
	public void setPostUpdatedOn(Date postUpdatedOn) {
		this.postUpdatedOn = postUpdatedOn;
	}
	public Date getCropProducedOn() {
		return cropProducedOn;
	}
	public void setCropProducedOn(Date cropProducedOn) {
		this.cropProducedOn = cropProducedOn;
	}
	

	
}
