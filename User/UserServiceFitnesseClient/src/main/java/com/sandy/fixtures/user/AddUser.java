package com.sandy.fixtures.user;

import com.sandy.api.UserService;
import com.sandy.domain.User;
import com.sandy.impl.UserServiceImpl;

public class AddUser {
	private String userId;
	private String password;

	UserService userService = new UserServiceImpl();
	private User user;
	
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

	public boolean getActive(){
//		return user.isActive();
		return true;
	}

	public void execute() {
		this.user = userService.createUser(this.userId, this.password);
	}
	
}
