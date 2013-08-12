package com.sandy.fixtures.user;

import com.sandy.api.UserService;
import com.sandy.domain.User;
import com.sandy.factory.ServiceFctory;

public class FetchUserByUserId {

	private UserService userService = ServiceFctory.getUserService();
	private User user;
	private String userId;

	public void setUserId(String userId) {
		this.userId = userId;
		
	}
	public boolean findUser() {
		this.user = userService.getUser(this.userId);
		return this.user != null;
	}
	
	public String userId() {
		return this.user == null ? null:this.user.getUserId();
	}

	public String userPassword() {
		return this.user == null ? null:this.user.getPassword();
	}

	public boolean userActive() {
		return this.user == null ? false:this.user.isActive();
	}
}
