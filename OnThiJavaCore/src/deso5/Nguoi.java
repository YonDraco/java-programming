package deso5;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private String ngaySinh;
	private String ngheNghiep;

	public Nguoi() {
	}

	public Nguoi(String hoTen, String ngaySinh, String ngheNghiep) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.ngheNghiep = ngheNghiep;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void nhapTT(Scanner sc) {
		System.out.println("Nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.println("Nhập ngày sinh: ");
		ngaySinh = sc.nextLine();
		System.out.println("Nhập nghề nghiệp: ");
		ngheNghiep = sc.nextLine();
	}

	public void inTT() {
		System.out.println("\nThông tin cá nhân: ");
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Nghề nghiệp: " + ngheNghiep);
	}
}
