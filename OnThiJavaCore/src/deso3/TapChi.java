package deso3;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	private int soPH;
	private int thangPH;

	public TapChi() {
		super();
	}

	public TapChi(String maTL, String tenNXB, int soBPH, int soPH, int thangPH) {
		super(maTL, tenNXB, soBPH);
		this.soPH = soPH;
		this.thangPH = thangPH;
	}

	public int getSoPH() {
		return soPH;
	}

	public void setSoPH(int soPH) {
		this.soPH = soPH;
	}

	public int getThangPH() {
		return thangPH;
	}

	public void setThangPH(int thangPH) {
		this.thangPH = thangPH;
	}

	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhap so phat hanh: ");
		soPH = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap thang phat hanh: ");
		thangPH = sc.nextInt();
		sc.nextLine();

	}

	public void inTT() {
		super.inTT();
		System.out.print("\nSo phat hanh: " + soPH);
		System.out.print("\nThang phat hanh: " + thangPH);
	}
}
