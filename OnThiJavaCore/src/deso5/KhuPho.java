package deso5;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
	private ArrayList<HoDan> dsHoDan;

	public KhuPho() {
		dsHoDan = new ArrayList<HoDan>();
	}

	public void themDanhSach(HoDan shd) {
		dsHoDan.add(shd);
	}

	public void nhapDanhSach(Scanner sc) {
		HoDan shd;
		System.out.println("Nhập số hộ dân: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			shd = new HoDan();
			shd.nhapTT(sc);
			dsHoDan.add(shd);
		}
	}

	public void inDanhSachCacHoCoNguoiMungTho80() {
		for (HoDan hoDan : dsHoDan) {
			if (hoDan.coNguoiMungTho80()) {
				System.out.print(hoDan.getSoNha() + " ");
			}
		}
	}

	public static void main(String[] args) {
		KhuPho kp = new KhuPho();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập danh sách ");
		kp.nhapDanhSach(sc);
		System.out.print("\nSố nhà của các hộ có người mừng thọ trên 80 tuổi là: ");
		kp.inDanhSachCacHoCoNguoiMungTho80();
	}
}
