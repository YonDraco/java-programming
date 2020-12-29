package deso5;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
	private ArrayList<HoDan> hd;

	public void themDanhSach(HoDan shd) {
		hd.add(shd);
	}

	public void nhapDanhSach(Scanner sc) {
		HoDan shd;
		System.out.println("Nhập số hộ dân: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			shd = new HoDan();
			shd.nhapTT(sc);
			hd.add(shd);
		}
	}

	public void inDanhSach() {
		for (HoDan hoDan : hd) {
			hoDan.inTT();
		}
	}

	public void timKiem(String ngaySinh) {
		for (HoDan hoDan : hd) {
			if (ngaySinh.equals(hoDan.getNgaySinh())) {
				hoDan.inTT();
			}
		}
	}

	public static void main(String[] args) {
		KhuPho kp = new KhuPho();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập danh sách ");
		kp.nhapDanhSach(sc);
		System.out.println("\nDanh sách khu phố là: ");
		kp.inDanhSach();
	}
}
