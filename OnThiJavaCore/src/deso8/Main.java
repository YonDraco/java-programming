package deso8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private ArrayList<CBGV> qlcb;

	public Main() {
		qlcb = new ArrayList<CBGV>();
	}

	public void themDanhSach(CBGV cb) {
		qlcb.add(cb);
	}

	public void nhapDanhSach(Scanner sc) {
		System.out.println("\nNhập số lượng cán bộ: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			CBGV cb = new CBGV();
			cb.nhapTT(sc);
			qlcb.add(cb);
		}
	}

	public void inDanhSach() {
		for (CBGV cb : qlcb) {
			cb.inTT();
		}
	}

	public void timKiemCanBoCoLuongThucLinhLonHon(int soTien) {
		for (CBGV cbgv : qlcb) {
			if (cbgv.getluongThucLinh() >= soTien) {
				cbgv.inTT();
			}
		}
	}

	public static void main(String[] args) {
		Main qlgv = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhập danh sách cán bộ giáo viên: ");
		qlgv.nhapDanhSach(sc);
		System.out.println("\nDanh sách cán bộ giáo viên: ");
		qlgv.inDanhSach();
		System.out.println("\nDanh sách cán bộ giáo viên có lương thục lĩnh >= 8 triệu: ");
		qlgv.timKiemCanBoCoLuongThucLinhLonHon(8000000);
		System.exit(0);
	}
}
