package com.sandy.api;

import java.util.Date;
import java.util.List;

import com.sandy.domain.User;

public interface UserService {

	void createUser(User user);

	User getUser(String userId);

	void activateUser(String userId);
	
	void deactivateUser(String userId);
	
	List<User> listUsersCreatedAfter(Date afterDate);

	List<User> listUsersCreatedBefore(Date beforeDate);
}
