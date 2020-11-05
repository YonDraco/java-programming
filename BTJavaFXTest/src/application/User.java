package application;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String username;
	private String password;
	private List<User> us;

	public User() {

	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private List<User> getUserList() {
		List<User> userList = new ArrayList<User>();
		userList.add(new User("Yon01", "123456"));
		userList.add(new User("Yon02", "123456"));
		userList.add(new User("Yon03", "123456"));
		userList.add(new User("Yon04", "123456"));
		return userList;

	}
}