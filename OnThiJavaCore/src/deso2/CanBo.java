package deso2;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	private String diaChi;

	public CanBo() {
	}

	public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void nhap(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		this.ngaySinh = sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		this.gioiTinh = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
	}

	public void inRa() {
		System.out.println("Ho ten la: " + hoTen);
		System.out.println("Ngay sinh la: " + ngaySinh);
		System.out.println("Gioi tinh la: " + gioiTinh);
		System.out.println("Dia chi la: " + diaChi);
	}
}
