package deso2;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien() {
		super();
	}

	public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.println("Nhap cong viec: ");
		this.congViec = sc.nextLine();
	}

	public void inRa() {
		super.inRa();
		System.out.println("Cong viec la: " + congViec);
	}
}
