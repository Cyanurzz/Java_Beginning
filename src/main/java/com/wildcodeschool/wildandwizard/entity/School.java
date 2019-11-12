package com.wildcodeschool.wildandwizard.entity;

public class School {
	
	//Attributs :
	
	private int id;
	private String name;
	private String country;
	private int capacity;
	
	//Constructor : 
	
	//public School() {}
	
	public School(int id, String name, String country, int capacity) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.capacity = capacity;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
