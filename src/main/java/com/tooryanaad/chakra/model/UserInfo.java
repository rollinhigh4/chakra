package com.tooryanaad.chakra.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo {
	
	@Id
	private String email;
	private String password;
	private String name;
	private String mobileNo;
	private String college;
	private int score;
	private int level;
	
	public UserInfo(String email, String password, String name, String mobileNo, String college, int score, int level) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.mobileNo = mobileNo;
		this.college = college;
		this.score = score;
		this.level = level;
	}
	
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	

}
