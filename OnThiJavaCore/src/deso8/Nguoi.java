package deso8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private Date ngaySinh;
	private String queQuan;

	public Nguoi() {
	}

	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}

	public String getHoTen() {
		return hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void nhapTT(Scanner sc) {
		System.out.println("Nhập thông tin cá nhân: \n");
		System.out.println("Nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.println("Nhập ngày sinh: ");
		String ngaySinhStr = sc.nextLine();
		ngaySinh = StringToDate(ngaySinhStr);
		System.out.println("Nhập quê quán: ");
		queQuan = sc.nextLine();
	}

	public void inTT() {
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Quê quán: " + queQuan);
	}

	private Date StringToDate(String ngaySinhStr) {
		// TODO Auto-generated method stub
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = sdf.parse(ngaySinhStr);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Sai định dạng ngày sinh");
		}
		return date;
	}
}
