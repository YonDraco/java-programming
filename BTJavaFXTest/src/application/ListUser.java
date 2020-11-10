package application;

import java.util.ArrayList;
import java.util.List;

import register.User;

public class ListUser {
	private List<User> listUser;

	public ListUser() {
		// TODO Auto-generated constructor stub
		listUser = new ArrayList<User>();
		listUser.add(new User("abc@gmail.com", "Nguyen Duc Nam"));
		listUser.add(new User("xyz@gmail.com", "Phan Van Duc"));
		listUser.add(new User("opq@gmail.com", "Nguyen Hai Hau"));
	}

	public void themUser(User user) {
		listUser.add(user);
	}

	public boolean checkExist(String email) {
		for (User user : listUser) {
			if (user.getEmail().equals(email)) {
				return true;
			}
		}

		return false;
	}
}
