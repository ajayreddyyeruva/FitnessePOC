package com.sandy.domain;

import java.util.Date;

public class User {

	private String userId;
	private String password;
	private boolean active = false;
	private Date createdDate = new Date();
	private Date updatDate = new Date();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatDate() {
		return updatDate;
	}

	public void setUpdatDate(Date updatDate) {
		this.updatDate = updatDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password
				+ ", active=" + active + ", createdDate=" + createdDate
				+ ", updatDate=" + updatDate + "]";
	}

}
