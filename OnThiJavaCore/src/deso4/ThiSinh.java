package deso4;

import java.util.Scanner;

public class ThiSinh {
	private String SBD;
	private String hoTen;
	private String diaChi;
	private String dienUuTien;

	public ThiSinh() {
	}

	public ThiSinh(String SBD, String hoTen, String diaChi, String dienUuTien) {
		this.SBD = SBD;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.dienUuTien = dienUuTien;
	}

	public String getSBD() {
		return SBD;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getDienUuTien() {
		return dienUuTien;
	}

	public void nhapTT(Scanner sc) {
		System.out.println("Nhập số báo danh: ");
		SBD = sc.nextLine();
		System.out.println("Nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.println("Nhập diện ưu tiên: ");
		dienUuTien = sc.nextLine();
	}

	public void inTT() {
		System.out.println("Số báo danh: " + SBD);
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Diện ưu tiên: " + dienUuTien);
	}
}
