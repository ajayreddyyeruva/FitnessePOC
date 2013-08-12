package com.sandy.fixtures.user;

import com.sandy.api.UserService;
import com.sandy.domain.User;
import com.sandy.factory.ServiceFctory;

public class UpdateUser {

	private UserService userService = ServiceFctory.getUserService();
	private String userId;
	private String password;
	private boolean active;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean updateUser() {
		return userService.updateUser(this.userId, this.password, this.active);
	}
}
