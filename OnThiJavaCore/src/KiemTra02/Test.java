package KiemTra02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// Tao doi tuong Scanner
		Scanner sc = new Scanner(System.in);

		// Nhap ho ten va dia chi cua sinh vien
		System.out.print("Nhap ho ten: ");
		String name = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		String address = sc.nextLine();

		// Tao doi tuong hoc sinh
		Student s = new Student(name, address);

		// Nhap so mon hoc can them
		System.out.print("Nhap so mon hoc can them: ");
		int n = sc.nextInt();
		sc.nextLine();

		// Them n mon hoc tu ban phim
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhap mon hoc thu %d:\n", i + 1);
			System.out.print("Nhap ten mon hoc: ");
			String tenMonHoc = sc.nextLine();
			System.out.print("Nhap diem: ");
			int diem = sc.nextInt();
			sc.nextLine();
			s.addCourseGrade(tenMonHoc, diem);
		}

		// Them mon hoc Network va diem 6
		s.addCourseGrade("Network", 6);

		// In ra thong tin cua sinh vien
		System.out.println(s.toString());
		s.inTT();

		// In ra diem trung binh cua sinh vien
		System.out.printf("Diem trung binh la: %.2f", s.getAverageGrades());

		sc.close();
	}
}
