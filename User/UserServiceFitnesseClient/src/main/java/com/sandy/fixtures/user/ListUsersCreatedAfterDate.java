package com.sandy.fixtures.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.om.query.QueryResultBuilder;
import com.om.query.domain.QueryResult;
import com.sandy.api.UserService;
import com.sandy.domain.User;
import com.sandy.factory.ServiceFactory;

public class ListUsersCreatedAfterDate {

	private UserService userService = ServiceFactory.getUserService();
	private final String startDate;
	static SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
	
	public ListUsersCreatedAfterDate(String startDate) {
		this.startDate = startDate;
	}
	
	
	public List<Object> query() {
		System.out.println("Fetching users created after " + startDate);
		List<User> users = null;
		try {
			users = userService.listUsersCreatedAfter(dateFormat.parse(startDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		QueryResultBuilder builder = new QueryResultBuilder(User.class);
		QueryResult result = builder.build(users);
		return result.render();
	}
}
