package baithuchanhso3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen;
	protected Date ngaySinh;
	protected String queQuan;

	public Nguoi() {
	}

	public Nguoi(String hoTen, Date ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}

	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this(hoTen, ngaySinh);
		this.queQuan = queQuan;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
		String ngaySinhstr = sc.nextLine();
		ngaySinh = stringToDate(ngaySinhstr);
		System.out.print("Nhập quê quán: ");
		queQuan = sc.nextLine();
	}

	public Date stringToDate(String ngaySinh) {
		Date ngaySinhDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngaySinhDate = sdf.parse(ngaySinh);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Lỗi định dạng ngày tháng!");
		}
		return ngaySinhDate;
	}

	public void inThongTin() {
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Quê quán: " + queQuan);
	}
}
