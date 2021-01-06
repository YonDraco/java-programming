package deso17;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c = new Course("Front End");
		c.addStudent("Yon");
		c.addStudent("Draco");
		System.out.println("Tên khoá học: " + c.getName());
		ArrayList<String> studentList = c.getStudents();
		for (String name : studentList) {
			System.out.println("Student name: " + name);
		}
	}

}
