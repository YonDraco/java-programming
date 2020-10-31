package baithuchanhso4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLNS {
	// Khai báo kiểu dsns là interface List để có thể linh động khi
	// chọn một kiểu khởi tạo về sau: ArrayList, LinkedList...
	private List<Nguoi> dsns;

	public QLNS() {
		// ...<Khởi tạo danh sách với 100 phần tử>...
		dsns = new ArrayList<Nguoi>(100);
	}

	public void themNhanSu(Nguoi ns) {
		// ...<Thêm vào ArrayList dùng phương thức add()>...
		dsns.add(ns);
	}

	public void nhapDanhSach(Scanner sc) {
		// ...<Nhập số học sinh cần nhập n>...
		System.out.print("Nhập số nhân sự n = ");
		int n = sc.nextInt();
		sc.nextLine();
		// ...<Vòng lặp 0->(n-1): nhập thông tin nhân sự và thêm vào danh sách>...
		int chon = 0;
		Nguoi ns = null;
		for (int i = 0; i < n; i++) {
			System.out.print("Chọn loại ns muốn nhập (0: hs, 1: sv): ");
			chon = sc.nextInt();
			sc.nextLine();
			switch (chon) {
			case 0:
				ns = new HocSinh();
				break;
			case 1:
				ns = new SinhVien();
				break;
			}
			ns.nhapThongTin(sc); // Tinh da hinh
			themNhanSu(ns);
		}
	}

	public void inDanhSach() {
		// ...<Dùng vòng lặp foreach duyệt qua dshs để in thông tin mỗi học sinh>...
		for (Nguoi ns : dsns) {
			ns.inThongTin(); // Tinh da hinh
		}
	}

	// Tìm kiếm sinh viên có mã 637634 trong danh sách
	public void timKiemTheoMSV(String msv) {
		for (Nguoi ns : dsns) {
			if (ns instanceof SinhVien) {
				SinhVien sv = (SinhVien) ns;
				if (msv.equals(sv.getMsv())) {
					sv.inThongTin();
				}
			}
		}
	}

	public static void main(String[] args) {
		QLNS qlns = new QLNS();
		Scanner sc = new Scanner(System.in);
		qlns.nhapDanhSach(sc);
		qlns.inDanhSach();
		qlns.timKiemTheoMSV("637634");
	}
}
