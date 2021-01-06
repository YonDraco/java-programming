package deso14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so tam giac: ");
		int n = sc.nextInt();
		ArrayList<TamGiac> dsTamGiac = new ArrayList<TamGiac>(n);

		for (int i = 0; i < n; i++) {
			System.out.printf("\nNhập vào tam giác thứ %d\n", i + 1);
			TamGiac tg = new TamGiac();
			tg.nhap(sc);
			dsTamGiac.add(tg);
		}

		int maxIndex = 0;
		int maxCV = dsTamGiac.get(0).tinhChuVi();
		for (int i = 0, size = dsTamGiac.size(); i < size; i++) {
			int cv = dsTamGiac.get(i).tinhChuVi();
			if (maxCV < cv) {
				maxCV = cv;
				maxIndex = i;
			}
		}

		System.out.printf("Tam giac lon nhat o vi tri thu %d\n", maxIndex + 1);
		System.out.println("Thong tin cua tam giac co chu vi lon nhat");
		dsTamGiac.get(maxIndex).inGTCacCanh();

	}

}
