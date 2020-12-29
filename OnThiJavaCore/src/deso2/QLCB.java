package deso2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

	private ArrayList<CanBo> dsCanBo;
	private Scanner sc = new Scanner(System.in);

	public void nhapThongTin() {
		System.out.println("Nhap so can bo can nhap: ");
		int soCanBo = sc.nextInt();

		this.dsCanBo = new ArrayList<CanBo>(soCanBo);
		for (int i = 0; i < soCanBo; i++) {
			System.out.printf("Can bo thu %d:\n", i + 1);
			System.out.println("Ban muon nhap thong tin cua can bo nao:");
			System.out.println("1. Cong nhan");
			System.out.println("2. Ky su");
			System.out.println("3. Nhan vien");
			System.out.println("Lua chon cua ban: ");
			int luaChon = sc.nextInt();
			sc.nextLine();

			String hoTen, ngaySinh, gioiTinh, diaChi;
			switch (luaChon) {
			case 1:
				System.out.println("Nhap ho ten: ");
				hoTen = sc.nextLine();
				System.out.println("Nhap ngay sinh: ");
				ngaySinh = sc.nextLine();
				System.out.println("Nhap gioi tinh: ");
				gioiTinh = sc.nextLine();
				System.out.println("Nhap dia chi: ");
				diaChi = sc.nextLine();
				System.out.println("Nhap bac: ");
				String bac = sc.nextLine();
				dsCanBo.add(new CongNhan(hoTen, ngaySinh, gioiTinh, diaChi, bac));
				break;

			case 2:
				System.out.println("Nhap ho ten: ");
				hoTen = sc.nextLine();
				System.out.println("Nhap ngay sinh: ");
				ngaySinh = sc.nextLine();
				System.out.println("Nhap gioi tinh: ");
				gioiTinh = sc.nextLine();
				System.out.println("Nhap dia chi: ");
				diaChi = sc.nextLine();
				System.out.println("Nhap nganh dao tao: ");
				String nganhDaoTao = sc.nextLine();
				dsCanBo.add(new KySu(hoTen, ngaySinh, gioiTinh, diaChi, nganhDaoTao));
				break;

			case 3:
				System.out.println("Nhap ho ten: ");
				hoTen = sc.nextLine();
				System.out.println("Nhap ngay sinh: ");
				ngaySinh = sc.nextLine();
				System.out.println("Nhap gioi tinh: ");
				gioiTinh = sc.nextLine();
				System.out.println("Nhap dia chi: ");
				diaChi = sc.nextLine();
				System.out.println("Nhap cong viec: ");
				String congViec = sc.nextLine();
				dsCanBo.add(new NhanVien(hoTen, ngaySinh, gioiTinh, diaChi, congViec));
				break;
			}
		}
	}

	public CanBo timKiemCanBo() {
		System.out.print("Nhap ho ten can bo can tim: ");
		String hoTenCanTim = sc.nextLine();
		for (CanBo cb : this.dsCanBo) {
			if (cb.getHoTen().equals(hoTenCanTim)) {
				return cb;
			}
		}

		return null;
	}

	public void hienThiThongTin(CanBo cb) {
		cb.inRa();
	}

	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		qlcb.nhapThongTin();
		qlcb.hienThiThongTin(qlcb.timKiemCanBo());
		System.exit(0);
	}
}
