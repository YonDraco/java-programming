package DeKiemTraThu;

public class Student extends Person {
	private int numCourses;
	private String[] course;
	private int[] grades;

	public Student() {

	}

	public Student(String name, String address) {
		setName(name);
		setAddress(address);
	}
}
