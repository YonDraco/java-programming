package baithuchanhso4;

import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi {
	private String lop;
	private String khoaHoc;
	private int kyHoc;

	public HocSinh() {
	}

	public HocSinh(String hoTen, Date ngaySinh, String lop, String khoaHoc) {
		super(hoTen, ngaySinh);
		this.lop = lop;
		this.khoaHoc = khoaHoc;
	}

	public HocSinh(String hoTen, String lop, String khoaHoc) {
		this.hoTen = hoTen;
		this.lop = lop;
		this.khoaHoc = khoaHoc;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("Nhập lớp: ");
		lop = sc.nextLine();
		System.out.print("Nhập khoá học: ");
		khoaHoc = sc.nextLine();
		System.out.print("Nhập kỳ học: ");
		kyHoc = sc.nextInt();
		sc.nextLine();
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.println("Lớp: " + lop);
		System.out.println("Khoá học: " + khoaHoc);
		System.out.println("kỳ học: " + kyHoc);
	}

	public String getlop() {
		return lop;
	}
}
