package deso3;

import java.util.Scanner;

public class TaiLieu {
	protected String maTL;
	protected String tenNXB;
	protected int soBPH;

	public TaiLieu() {

	}

	public TaiLieu(String maTL, String tenNXB, int soBPH) {
		this.maTL = maTL;
		this.tenNXB = tenNXB;
		this.soBPH = soBPH;
	}

	public String getMaTL() {
		return maTL;
	}

	public void setMaTL(String maTL) {
		this.maTL = maTL;
	}

	public String getTenNXB() {
		return tenNXB;
	}

	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

	public int getSoBPH() {
		return soBPH;
	}

	public void setSoBPH(int soBPH) {
		this.soBPH = soBPH;
	}

	public void nhap(Scanner sc) {
		System.out.print("Nhap ma tai lieu: ");
		maTL = sc.nextLine();
		System.out.print("Nhap ten nha xuat ban: ");
		tenNXB = sc.nextLine();
		System.out.print("Nhap so ban phat hanh: ");
		soBPH = sc.nextInt();
		sc.nextLine();
	}

	public void inTT() {
		System.out.print("\nMa tai lieu la: " + maTL);
		System.out.print("\nTen nha xuat ban: " + tenNXB);
		System.out.print("\nSo ban phat hanh: " + soBPH);
	}
}
