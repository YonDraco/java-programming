package baithuchanhso3;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	private ArrayList<HocSinh> dshs;

	public QLHS() {
		dshs = new ArrayList<HocSinh>(100);
	}

	public void themHocSinh(HocSinh hs) {
		dshs.add(hs);
	}

	public void nhapDanhSach(Scanner sc) {
		System.out.print("Nhập số học sinh n= ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			HocSinh hs = new HocSinh();
			hs.nhapThongTin(sc);
			themHocSinh(hs);
		}
	}

	public void inDanhSach() {
		for (HocSinh hs : dshs) {
			hs.inThongTin();
		}
	}

	public void timKiemHocSinh(int namSinh, String queQuan) {
		for (HocSinh hs : dshs) {
			if (queQuan.equals(hs.queQuan) && namSinh == hs.ngaySinh.getYear() + 1900) {
				hs.inThongTin();
			}
		}
	}

	public void timKiemHocSinh(String lop) {
		for (HocSinh hs : dshs) {
			if (lop.equals(hs.getlop())) {
				hs.inThongTin();
			}
		}
	}

	public static void main(String[] args) {
		QLHS qlhs = new QLHS();
		Scanner sc = new Scanner(System.in);
		qlhs.nhapDanhSach(sc);
		qlhs.inDanhSach();
		qlhs.timKiemHocSinh(1985, "Thái Nguyên");
		qlhs.timKiemHocSinh("10A1");
	}
}
