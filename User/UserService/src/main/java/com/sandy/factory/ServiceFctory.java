package com.sandy.factory;

import com.sandy.api.UserService;
import com.sandy.impl.UserServiceImpl;

public class ServiceFctory {

	private static UserServiceImpl userServiceImpl;

	public static UserService getUserService() {
		if (null == userServiceImpl) {
			userServiceImpl = new UserServiceImpl();
		}
		return userServiceImpl;
	}

}
