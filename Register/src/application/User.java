package application;

public class User {
	private String hoten;
	private String email;

	public User() {

	}

	User(String hoten, String email) {
		this.hoten = hoten;
		this.email = email;
	}

	public String getHoten() {
		return hoten;
	}

	public String getEmail() {
		return email;
	}
}
