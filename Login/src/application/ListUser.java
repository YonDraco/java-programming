package application;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
	private List<User> accList;

	public ListUser() {
		accList = new ArrayList<User>();

		User acc1 = new User("yon123", "Hoa123");
		User acc2 = new User("yon456", "Hoa456");
		User acc3 = new User("yon789", "Hoa789");
		// add vao ds
		accList.add(acc1);
		accList.add(acc2);
		accList.add(acc3);
	}

	// Ham tra ve ds
	public List<User> traVe() {
		return accList;
	}

	// Them tkhoan
	public void themAccount(String username, String password) {
		User acc = new User(username, password);
		accList.add(acc);
	}
}