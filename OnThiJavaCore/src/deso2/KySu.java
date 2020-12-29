package deso2;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhDaoTao;

	public KySu() {
		super();
	}

	public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.println("Nhap nganh dao tao: ");
		this.nganhDaoTao = sc.nextLine();
	}

	public void inRa() {
		super.inRa();
		System.out.println("Nganh dao tao la: " + nganhDaoTao);
	}
}
