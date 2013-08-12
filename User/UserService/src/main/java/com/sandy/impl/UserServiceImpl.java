package com.sandy.impl;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.sandy.api.UserService;
import com.sandy.domain.User;
import com.sandy.exception.UserAlreadyExistsException;

public class UserServiceImpl implements UserService {

	Map<String, User> usersMap = new LinkedHashMap<String, User>();

	public User getUser(String userId) {
		return usersMap.get(userId);
	}

	public void activateUser(String userId) {
		// TODO Auto-generated method stub

	}

	public void deactivateUser(String userId) {
		// TODO Auto-generated method stub

	}

	public List<User> listUsersCreatedAfter(Date afterDate) {
		List<User> usersCreatedAfterDate = new LinkedList<User>();
		for (User user : usersMap.values()) {
			if (user.getCreatedDate().after(afterDate))
				usersCreatedAfterDate.add(user);
		}
		return usersCreatedAfterDate;
	}

	public List<User> listUsersCreatedBefore(Date beforeDate) {
		List<User> usersCreatedAfterDate = new LinkedList<User>();
		return usersCreatedAfterDate;
	}

	public User createUser(String userId, String password) {
		if (usersMap.containsKey(userId)) {
			throw new UserAlreadyExistsException(
					"User with userid already exists");
		}
		User user = new User(userId, password);
		usersMap.put(userId, user);
		return user;
	}

	public boolean updateUser(String userId, String password, boolean active) {
		boolean userUpdated = false;
		User user = getUser(userId);
		if (null != user) {
			user.setPassword(password);
			user.setActive(active);
			userUpdated = true;
		}
		return userUpdated;

	}
	
	public boolean deleteUser(String userId) {
		boolean userDeleted = false;
		User user = getUser(userId);
		if (null != user) {
			usersMap.remove(userId);
			userDeleted = true;
		}
		return userDeleted;
	}

}
