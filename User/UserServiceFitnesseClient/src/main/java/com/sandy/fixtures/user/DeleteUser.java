package com.sandy.fixtures.user;

import com.sandy.api.UserService;
import com.sandy.factory.ServiceFactory;

public class DeleteUser {

	private String userId;

	private UserService userService = ServiceFactory.getUserService();

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean deleteUser() {
		return userService.deleteUser(this.userId);
	}

}
