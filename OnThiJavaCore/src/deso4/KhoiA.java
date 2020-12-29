package deso4;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	private String monThi1;
	private String monThi2;
	private String monThi3;

	public KhoiA() {
	}

	public KhoiA(String monThi1, String monThi2, String monThi3) {
		this.monThi1 = monThi1;
		this.monThi2 = monThi2;
		this.monThi3 = monThi3;
	}

	public void nhapTT(Scanner sc) {
		super.nhapTT(sc);
		System.out.println("Nhập môn thi 1: ");
		monThi1 = sc.nextLine();
		System.out.println("Nhập môn thi 2: ");
		monThi2 = sc.nextLine();
		System.out.println("Nhập môn thi 3: ");
		monThi3 = sc.nextLine();
	}

	public void inTT() {
		super.inTT();
		System.out.println("Môn thi: " + monThi1 + "; " + monThi2 + "; " + monThi3);
	}

}
