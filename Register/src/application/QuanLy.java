package application;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
	private List<User> userList;

	public QuanLy() {
		userList = new ArrayList<User>();

		User u1 = new User("Hoàng Thị Hoà 01", "hoa123@gmail.com");
		User u2 = new User("Hoàng Thị Hoà 02", "hoa123@gmail.com");
		User u3 = new User("Hoàng Thị Hoà 03", "hoa123@gmail.com");
		// add vao ds
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
	}

	// Ham tra ve ds
	public List<User> traVe() {
		return userList;
	}

	// Them tkhoan
	public void themUser(String hoten, String email) {
		User acc = new User(hoten, email);
		userList.add(acc);
	}
}
