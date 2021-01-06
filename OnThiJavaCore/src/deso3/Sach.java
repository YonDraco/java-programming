package deso3;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tenTG;
	private int soTrang;

	public Sach() {
		super();
	}

	public Sach(String maTL, String tenNXB, int soBPH, String tenTG, int soTrang) {
		super(maTL, tenNXB, soBPH);
		this.tenTG = tenTG;
		this.soTrang = soTrang;
	}

	public String getTenTG() {
		return tenTG;
	}

	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhap ten tac gia: ");
		tenTG = sc.nextLine();
		System.out.print("Nhap so trang: ");
		soTrang = sc.nextInt();
		sc.nextLine();

	}

	public void inTT() {
		super.inTT();
		System.out.print("\nTen tac gia: " + tenTG);
		System.out.print("\nSo trang: " + soTrang);
	}
}
