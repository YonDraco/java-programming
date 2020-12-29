package deso4;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	private ArrayList<ThiSinh> tuyenSinh;

	public TuyenSinh(int size) {
		tuyenSinh = new ArrayList<ThiSinh>(size);
	}

	public void themThiSinh(ThiSinh ts) {
		tuyenSinh.add(ts);
	}

	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts;
		System.out.println("Nhập số lượng thí sinh: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			ts = new KhoiA();
			System.out.println("Chọn khối thí sinh (1. Khối A; 2. Khối B; 3. Khối C): ");
			int chon = sc.nextInt();
			sc.nextLine();
			switch (chon) {
			case 1:
				ts = new KhoiA();
				break;
			case 2:
				ts = new KhoiB();
				break;
			case 3:
				ts = new KhoiC();
				break;
			default:
				break;
			}
			ts.nhapTT(sc);
			tuyenSinh.add(ts);
		}
	}

	public void inDanhSach() {
		for (ThiSinh thiSinh : tuyenSinh) {
			thiSinh.inTT();
		}
	}

	public void timKiemSBD(String SBD) {
		for (ThiSinh thiSinh : tuyenSinh) {
			if (thiSinh.getSBD().equals(SBD)) {
				thiSinh.inTT();
			}
		}
	}

	public static void main(String[] args) {
		TuyenSinh ts = new TuyenSinh(20);
		Scanner sc = new Scanner(System.in);
		ts.nhapDanhSach(sc);
		System.out.println("\nDanh sách thí sinh: ");
		ts.inDanhSach();
		System.out.println("Nhập số báo danh cần tìm kiếm: ");
//		ts.timKiemSBD("637634");
		String sbd = sc.nextLine();
		ts.timKiemSBD(sbd);
	}
}
