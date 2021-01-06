package deso14;

import java.util.Scanner;

public class TamGiac extends DaGiac {
	public TamGiac() {
		super(3);
	}

	@Override
	public int tinhChuVi() {
		int chuVi = 0;
		for (int i = 0, n = this.soCanh; i < n; i++) {
			chuVi = chuVi + dsCanh[i];
		}

		return chuVi;
	}

	public void nhap(Scanner sc) {
		do {
			super.nhap(sc);
			if (!kiemTraHopLe()) {
				System.out.println("!!!Nhập sai nhập lại");
			}
		} while (!kiemTraHopLe());
	}

	public boolean kiemTraHopLe() {
		int a = dsCanh[0];
		int b = dsCanh[1];
		int c = dsCanh[2];
		return !(a + b <= c || a + c <= b || b + c <= a);
	}

}
