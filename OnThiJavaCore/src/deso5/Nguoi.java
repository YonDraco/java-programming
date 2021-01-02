package deso5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private String ngaySinhStr;
	private Date ngaySinh;
	private String ngheNghiep;

	public Nguoi() {
	}

	public Nguoi(String hoTen, String ngaySinhStr, String ngheNghiep) {
		this.hoTen = hoTen;
		this.ngaySinhStr = ngaySinhStr;
		this.ngheNghiep = ngheNghiep;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getNgaySinh() {
		return ngaySinhStr;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void nhapTT(Scanner sc) {
		System.out.print("Nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.print("Nhập ngày sinh: ");
		ngaySinhStr = sc.nextLine();
		ngaySinh = stringToDate(ngaySinhStr);
		System.out.print("Nhập nghề nghiệp: ");
		ngheNghiep = sc.nextLine();
	}

	public Date stringToDate(String dateTimeStr) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = sdf.parse(ngaySinhStr);
		} catch (Exception e) {
			System.out.println("Sai định dạng ngày sinh");
		}
		return date;
	}

	@SuppressWarnings("deprecation")
	public int getAge() {
		LocalDate now = LocalDate.now();
		LocalDate birthday = LocalDate.of(ngaySinh.getYear() + 1900, ngaySinh.getMonth() + 1, ngaySinh.getDate());
		Period p = Period.between(birthday, now);
		return (int) (p.getYears());
	}

	public void inTT() {
		System.out.println("\nThông tin cá nhân: ");
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Nghề nghiệp: " + ngheNghiep);
	}
}
