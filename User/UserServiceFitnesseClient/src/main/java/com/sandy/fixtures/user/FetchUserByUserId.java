package com.sandy.fixtures.user;

import com.sandy.api.UserService;
import com.sandy.domain.User;
import com.sandy.factory.ServiceFctory;

public class FetchUserByUserId {

	private UserService userService = ServiceFctory.getUserService();
	private User user;

	public boolean findUser(String userId) {
		this.user = userService.getUser(userId);
		return this.user != null;
	}
	
	public String getUserId() {
		return this.user.getUserId();
	}

	public String getUserPassword() {
		return this.user.getPassword();
	}

	public boolean isUserActive() {
		return this.user.isActive();
	}
}
