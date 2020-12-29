package deso8;

import java.util.Date;
import java.util.Scanner;

public class CBGV extends Nguoi {
	private int luongCung;
	private int thuong;
	private int phat;
	private int luongThucLinh;

	public CBGV() {
	}

	public CBGV(String hoTen, Date ngaySinh, String queQuan, int luongCung, int thuong, int phat, int luongThucLinh) {
		super(hoTen, ngaySinh, queQuan);
		this.luongCung = luongCung;
		this.thuong = thuong;
		this.phat = phat;
		this.luongThucLinh = luongThucLinh;
	}

	public int getLuongCung() {
		return luongCung;
	}

	public int getThuong() {
		return thuong;
	}

	public int getPhat() {
		return phat;
	}

	public int getluongThucLinh() {
		return luongThucLinh;
	}

	public void nhapTT(Scanner sc) {
		super.nhapTT(sc);
		System.out.println("Nhập lương cứng: ");
		luongCung = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhập tiền thưởng: ");
		thuong = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhập tiền phạt: ");
		phat = sc.nextInt();
		sc.nextLine();

		luongThucLinh = luongCung + thuong - phat;
	}

	public void inTT() {
		super.inTT();
		System.out.println("Lương cứng: " + luongCung);
		System.out.println("Tiền thưởng: " + thuong);
		System.out.println("Tiền phạt: " + phat);
		System.out.println("Lương thực lĩnh: " + luongThucLinh);
	}
}
