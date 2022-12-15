package by.it.avramchuk.bean;

import java.util.HashMap;
import java.util.Map;

public class UserList {
	
	private static Map<String, User> users = new HashMap<>();
	
	
	
	public static Map<String, User> getUsers(){
		return users;
	}
	
	
	public static void addUser(User user) {
		users.put(user.getPassword(), user);
	}

}
