package deso14;

import java.util.Scanner;

public abstract class DaGiac {
	protected int soCanh;
	protected int dsCanh[];
	Scanner sc = new Scanner(System.in);

	public DaGiac() {
		this.soCanh = 0;
		this.dsCanh = new int[1];
	}

	public DaGiac(int soCanh) {
		this.soCanh = soCanh;
		this.dsCanh = new int[soCanh];
	}

	public int getSoCanh() {
		return soCanh;
	}

	public void setSoCanh(int soCanh) {
		this.soCanh = soCanh;
	}

	public void inGTCacCanh() {
		for (int i = 0, n = this.soCanh; i < n; i++) {
			System.out.printf("Gia tri cua canh %d: %d\n", i + 1, this.dsCanh[i]);
		}
	}

	public abstract int tinhChuVi();

	public void nhap(Scanner sc) {
		for (int i = 0; i < this.soCanh; i++) {
			System.out.printf("Nhập cạnh thứ %d :", i + 1);
			this.dsCanh[i] = sc.nextInt();
		}
	}
}
