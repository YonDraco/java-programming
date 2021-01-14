package de2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CanBo {
	protected String hoTen;
	protected Date ngaySinh;
	protected String gioiTinh;
	protected String diaChi;

	public CanBo() {
	}

	public CanBo(String hoTen, String ngaySinhStr, String gioiTinh, String diaChi) {
		this.hoTen = hoTen;
		this.ngaySinh = stringToDate(ngaySinhStr);
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public Date stringToDate(String input) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
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
		System.out.print("Nhap ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.print("Nhap ngay sinh ngay/thang/nam: ");
	}

}
