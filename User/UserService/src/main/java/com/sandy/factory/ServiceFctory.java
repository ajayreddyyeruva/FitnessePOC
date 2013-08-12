package com.sandy.factory;

import com.sandy.api.UserService;
import com.sandy.impl.UserServiceImpl;

public class ServiceFctory {

	public static UserService getUserService() {
		return new UserServiceImpl();
	}

}
