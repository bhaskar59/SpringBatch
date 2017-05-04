package com.muni.batch.entity;

import java.util.Date;

import org.hibernate.internal.util.Cloneable;

public class User extends Cloneable{
	
	private String userName;
	
	private int age;
	
	private boolean updateIndicator;
	
	private Date loogedInDate;

	private String emailId;

	public User(String userName, int age, boolean updateIndicator,
			Date loogedInDate, String emailId) {
		super();
		this.userName = userName;
		this.age = age;
		this.updateIndicator = updateIndicator;
		this.loogedInDate = loogedInDate;
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isUpdateIndicator() {
		return updateIndicator;
	}

	public void setUpdateIndicator(boolean updateIndicator) {
		this.updateIndicator = updateIndicator;
	}

	public Date getLoogedInDate() {
		return loogedInDate;
	}

	public void setLoogedInDate(Date loogedInDate) {
		this.loogedInDate = (Date) loogedInDate.clone();
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}
