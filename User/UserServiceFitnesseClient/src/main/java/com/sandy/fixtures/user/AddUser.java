package com.sandy.fixtures.user;

import com.sandy.api.UserService;
import com.sandy.domain.User;
import com.sandy.exception.UserAlreadyExistsException;
import com.sandy.factory.ServiceFactory;

public class AddUser {
	private String userId;
	private String password;

	private UserService userService = ServiceFactory.getUserService();

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

	public boolean active() {
		return null != user ? user.isActive() : false;
	}

	public boolean created() {
		try {
			this.user = userService.createUser(this.userId, this.password);
		} catch (UserAlreadyExistsException e) {
			return false;
		}
		return this.user != null;
	}

}
