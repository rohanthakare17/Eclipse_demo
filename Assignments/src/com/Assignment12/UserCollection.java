package com.Assignment12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserCollection {
	private static Map<User, UserDetails> userData;

	static {
		userData = new HashMap<User, UserDetails>();

		User user1 = new User("Bunny", "Kalpesh@123");
		User user2 = new User("Vipul", "Vipul#123");
		User user3 = new User("Nakul", "Nakul$123");

		UserDetails details1 = new UserDetails("Kalpesh", "Patil", 24);
		UserDetails details2 = new UserDetails("Vipul", "Patil", 25);
		UserDetails details3 = new UserDetails("Nakul", "Chaudhari", 22);

		userData.put(user1, details1);
		userData.put(user2, details2);
		userData.put(user3, details3);

	}

	public static UserDetails getUserDetails(User key) throws InvalidUserException {
		Set<User> user = userData.keySet();

		for (User us : user) {
			if (us.getUserName().equals(key.getUserName()) && us.getPassword().equals(key.getPassword())) {
				UserDetails found = userData.get(us);
				return found;
			}else
				continue;
		}
		InvalidUserException ex=new InvalidUserException("Invalid User...!!!","Invalid UserName And Password");
		throw ex;

	}

	public UserCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
