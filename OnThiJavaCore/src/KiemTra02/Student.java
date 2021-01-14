package KiemTra02;

public class Student extends Person {
	private int numCourses;
	private String courses[];
	private int grades[];
	private final int MAX_COURSES = 30;

	public Student() {
		super();
	}

	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
		numCourses = 0;
	}

	public String toString() {
		return this.name + "(" + this.address + ")";
	}

	public void addCourseGrade(String course, int grade) {
		this.courses[numCourses] = course;
		this.grades[numCourses] = grade;
		++numCourses;
	}

	public double getAverageGrades() {
		int sum = 0;
		for (int i = 0; i < numCourses; ++i) {
			sum += grades[i];
		}
		return (double) sum / numCourses;
	}

	public void inTT() {
		super.inTT();
		for (int i = 0; i < numCourses; ++i) {
			System.out.println(courses[i] + ":" + grades[i]);
		}
	}
}
