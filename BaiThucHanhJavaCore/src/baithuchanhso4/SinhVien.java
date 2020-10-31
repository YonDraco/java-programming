package baithuchanhso4;

import java.util.Scanner;

public class SinhVien extends Nguoi {
	private String msv;

	public SinhVien() {

	}

	public SinhVien(String hoTen, String msv) {
		this.hoTen = hoTen;
		this.msv = msv;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("Nhập vào mã sinh viên: ");
		msv = sc.nextLine();
	}

	public void inThongTin() {
		super.inThongTin();

		System.out.println("Mã sinh viên: " + msv);
	}

	public String getMsv() {
		return msv;
	}
}
