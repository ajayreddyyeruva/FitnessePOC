package com.sandy.impl;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.sandy.api.UserService;
import com.sandy.domain.User;
import com.sandy.exception.UserAlreadyExistsException;

public class UserServiceImpl implements UserService{
	
	Map<String, User> usersMap = new LinkedHashMap<String, User>();

	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void activateUser(String userId) {
		// TODO Auto-generated method stub
		
	}

	public void deactivateUser(String userId) {
		// TODO Auto-generated method stub
		
	}

	public List<User> listUsersCreatedAfter(Date afterDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listUsersCreatedBefore(Date beforeDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public User createUser(String userId, String password) {
		if(usersMap.containsKey(userId)) {
			throw new UserAlreadyExistsException("User with userid already exists");
		}
		User user = new User(userId, password);
		usersMap.put(userId, user);
		return user;
	}

}
