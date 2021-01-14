package KiemTra02;

public class Person {
	protected String name;
	protected String address;

	public Person() {
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void inTT() {
		System.out.println("Ho va ten: " + name);
		System.out.println("Dia diem: " + address);
	}
}
