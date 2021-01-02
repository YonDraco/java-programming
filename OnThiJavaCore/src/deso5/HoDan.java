package deso5;

import java.util.ArrayList;
import java.util.Scanner;

public class HoDan extends Nguoi {
	private ArrayList<Nguoi> dsThanhVien;
	private int soNha;

	public HoDan() {
		dsThanhVien = new ArrayList<Nguoi>();
	};

	public HoDan(ArrayList<Nguoi> stv, int soNha) {
		this.dsThanhVien = stv;
		this.soNha = soNha;
	}

	public int getSoNha() {
		return soNha;
	}

	public void themDS(Nguoi ng) {
		dsThanhVien.add(ng);
	}

	public void nhapTT(Scanner sc) {
		Nguoi ng;
		System.out.println("Nhập số thành viên trong hộ: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			ng = new Nguoi();
			ng.nhapTT(sc);
			dsThanhVien.add(ng);
		}
		System.out.println("Nhập số nhà: ");
		soNha = sc.nextInt();
		sc.nextLine();
	}

	public void inTT() {
		for (Nguoi nguoi : dsThanhVien) {
			System.out.println("\nThông tin hộ gia đình: ");
			nguoi.inTT();
		}
		System.out.println("\nSố nhà: " + soNha);
	}

	public boolean coNguoiMungTho80() {
		for (Nguoi ng : dsThanhVien) {
			if (ng.getAge() >= 80) {
				return true;
			}
		}

		return false;
	}
}
