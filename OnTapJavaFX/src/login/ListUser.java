package login;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
	private List<User> listUser;
	private Object password;

	public ListUser() {
		// TODO Auto-generated constructor stub
		listUser = new ArrayList<User>();
		listUser.add(new User("hth.it.mm@gmail.com", "HoaA123"));
		listUser.add(new User("hoanghoa00@gmail.com", "HoaB123"));
		listUser.add(new User("yondraco00@gmail.com", "HoaC123"));
	}

	public void themUser(User user) {
		listUser.add(user);
	}

	public boolean checkExist(String usename) {
		for (User user : listUser) {
			if (user.getUsername().equals(usename) && user.getPassword().equals(password)) {
				return true;
			}
		}

		return false;
	}
}
