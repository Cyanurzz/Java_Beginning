package com.wildCodeSchool.JDBC1.SELECT.entity;

import java.util.Date;

public class Wizard {
	
	//Attributs
	
	private Long id;
	private String firstName;
	private String lastName;
	private Date birthday;
	private String birthPlace;
	private String biography;
	private boolean muggle;
	
	//Constructor
	
	public Wizard(Long id, String firstName, String lastName) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Wizard(Long id, String firstName, String lastName, Date birthday, String birthPlace, String biography, boolean muggle) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.birthPlace = birthPlace;
		this.biography = biography;
		
		
	}

	//Setter & Getter
	
	

	public Long getId() {
		return id;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public boolean isMuggle() {
		return muggle;
	}
	public void setMuggle(boolean muggle) {
		this.muggle = muggle;
		
	}
}
