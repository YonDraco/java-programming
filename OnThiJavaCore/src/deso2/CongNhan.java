package deso2;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private String bac;

	public CongNhan() {
		super();
	}

	public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.bac = bac;
	}

	public String getBac() {
		return bac;
	}

	public void setBac(String bac) {
		this.bac = bac;
	}

	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.println("Nhap bac: ");
		this.bac = sc.nextLine();
	}

	public void inRa() {
		super.inRa();
		System.out.println("Bac la: " + bac);
	}
}
