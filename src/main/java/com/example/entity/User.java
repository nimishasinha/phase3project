package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
//	private boolean isRegistered;
	private String mobileNo;
	private String city;
	private String gender;
	private String password;
	
	/*
	 * @OneToMany(cascade=CascadeType.ALL , mappedBy="user") private List<Role> role
	 * = new ArrayList();
	 */
	

	
	public User(String userName, boolean isRegistered, String mobileNo, String city, String gender, String password) {
		super();
		this.userName = userName;
		//this.isRegistered = isRegistered;
		this.mobileNo = mobileNo;
		this.city = city;
		this.gender = gender;
		this.password = password;
	}

	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/*
	 * public boolean isRegistered() { return isRegistered; }
	 * 
	 * public void setRegistered(boolean isRegistered) { this.isRegistered =
	 * isRegistered; }
	 */

	/*
	 * public List<Role> getRole() { return role; }
	 * 
	 * public void setRole(List<Role> role) { this.role = role; }
	 */
	
	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", mobileNo=" + mobileNo + ", city=" + city + ", gender="
				+ gender + ", password=" + password + "]";
	}

	
	
	
	

}
