package deso4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThiSinh {
	public enum MonHoc {
		Toan, Ly, Hoa, Sinh, Van, Su, Dia
	};

	public MonHoc[] dsMonHoc = new MonHoc[3];

	private String SBD;
	private String hoTen;
	private String diaChi;
	private String dienUuTien;

	public ThiSinh() {
	}

	public String enum2String(MonHoc monHoc) {
		switch (monHoc) {
		case Toan:
			return "Toán";
		case Ly:
			return "Lý";
		case Hoa:
			return "Hoá";
		case Sinh:
			return "Sinh";
		case Van:
			return "Văn";
		case Su:
			return "Sử";
		case Dia:
			return "Địa";
		}

		return null;
	}

	public ThiSinh(String SBD, String hoTen, String diaChi, String dienUuTien) {
		this.SBD = SBD;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.dienUuTien = dienUuTien;
	}

	public String getSBD() {
		return SBD;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getDienUuTien() {
		return dienUuTien;
	}

	public void nhapTT(Scanner sc) {
		System.out.print("Nhập số báo danh: ");
		SBD = sc.nextLine();
		System.out.print("Nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.print("Nhập địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.print("Nhập diện ưu tiên: ");
		dienUuTien = sc.nextLine();
	}

	public void inTT() {
		System.out.println("Số báo danh: " + SBD);
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Diện ưu tiên: " + dienUuTien);

		// In ra các môn học
		// dsmh = {Toán, Lý, Hoá}
		// String.join(", ", dsmh)
		// Ouput: "Toán, Lý, Hoá"
		List<String> dsmhStr = new ArrayList<String>();
		System.out.print("Môn học: ");
		for (MonHoc mh : this.dsMonHoc) {
			dsmhStr.add(this.enum2String(mh));
		}
		String result = String.join(", ", dsmhStr);
		System.out.println(result);
	}
}
