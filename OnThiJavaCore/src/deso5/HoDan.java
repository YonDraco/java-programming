package deso5;

import java.util.ArrayList;
import java.util.Scanner;

public class HoDan extends Nguoi {
	private ArrayList<Nguoi> stv;
	private int soNha;

	public HoDan() {
		stv = new ArrayList<Nguoi>();
	};

	public HoDan(ArrayList<Nguoi> stv, int soNha) {
		this.stv = stv;
		this.soNha = soNha;
	}

	public int getSoNha() {
		return soNha;
	}

	public void themDS(Nguoi ng) {
		stv.add(ng);
	}

	public void nhapTT(Scanner sc) {
		Nguoi ng;
		System.out.println("Nhập số thành viên trong hộ: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			ng = new Nguoi();
			ng.nhapTT(sc);
			stv.add(ng);
		}
		System.out.println("Nhập số nhà: ");
		soNha = sc.nextInt();
		sc.nextLine();
	}

	public void inTT() {
		for (Nguoi nguoi : stv) {
			System.out.println("\nThông tin hộ gia đình: ");
			nguoi.inTT();
		}
		System.out.println("\nSố nhà: " + soNha);
	}
}
