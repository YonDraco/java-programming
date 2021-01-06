//Class Course (khóa học) dưới đây dùng mảng để quản lý danh sách sinh viên. Hãy viết lại class này sử
//dụng ArrayList thay thế cho mảng
package deso17;

import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<String> students = new ArrayList<String>();

	public Course() {

	}

	public Course(String name) {
		this.name = name;
	}

	public void addStudent(String student) {
		students.add(student);
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

}
