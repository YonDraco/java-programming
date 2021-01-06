package deso3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	private ArrayList<TaiLieu> dsTaiLieu;
	private Scanner sc = new Scanner(System.in);

	public void nhap(Scanner sc) {
		System.out.println("Nhap so tai lieu: ");
		int soTL = sc.nextInt();
		this.dsTaiLieu = new ArrayList<TaiLieu>();
		for (int i = 0; i < soTL; i++) {
			System.out.printf("Tai lieu thu %d:\n", i + 1);
			System.out.println("Ban muon nhap thong tin cua tai lieu nao:");
			System.out.println("1. Sach");
			System.out.println("2. Tap chi");
			System.out.println("3. Bao");
			System.out.print("Lua chon cua ban: ");
			int luaChon = sc.nextInt();
			sc.nextLine();

			switch (luaChon) {
			case 1:
				Sach sach = new Sach();
				sach.nhap(sc);
				dsTaiLieu.add(sach);
				break;
			case 2:
				TapChi tc = new TapChi();
				tc.nhap(sc);
				dsTaiLieu.add(tc);
				break;

			case 3:
				Bao b = new Bao();
				b.nhap(sc);
				dsTaiLieu.add(b);
				break;
			}
		}
	}

	public TaiLieu timKiemTaiLieu() {
		System.out.print("Nhap ma tai lieu can tim: ");
		String maTL = sc.nextLine();
		for (TaiLieu tl : this.dsTaiLieu) {
			if (tl.getMaTL().equals(maTL)) {
				return tl;
			}
		}

		return null;
	}

	public void hienThiThongTin(TaiLieu tl) {
		tl.inTT();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLySach qls = new QuanLySach();
		qls.nhap(sc);
		qls.hienThiThongTin(qls.timKiemTaiLieu());
		System.exit(0);
	}
}
