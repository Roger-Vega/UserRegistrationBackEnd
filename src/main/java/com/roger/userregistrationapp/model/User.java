package com.roger.userregistrationapp.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{

	@Id
	@Column(name="userId")
	private String userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="birthday")
	private Date birthday;
	
	@Column(name="homeAddress")
	private String homeAddress;
	
	@Column(name="hobbie")
	private String hobbie;
	
	@Column(name="description")
	private String description;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="gender")
	private char gender;
	
	@Column(name="civilStatus")
	private String civilStatus;
	
	@Column(name="email")
	private String email;
	
	public User() {}

	public User(String userId, String name, Date birthday, String homeAddress, String hobbie, String description,
			String telephone, char gender, String civilStatus, String email) {
		super();
		this.userId = userId;
		this.name = name;
		this.birthday = birthday;
		this.homeAddress = homeAddress;
		this.hobbie = hobbie;
		this.description = description;
		this.telephone = telephone;
		this.gender = gender;
		this.civilStatus = civilStatus;
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
