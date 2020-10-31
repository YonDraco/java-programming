package core;

public class Human {
	// Khai báo các thuộc tính chung của nhân sự
	protected String fullname;
	protected String address;
	protected String code;

	// constructor 1
	public Human() {
	}

	// constructor 2
	public Human(String code, String fullname, String address) {
		this.code = code;
		this.fullname = fullname;
		this.address = address;
	}
	// Viết các phương thức get, set ứng với các thuộc tính

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
