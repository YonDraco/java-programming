package de1;

public class Main {
	private static PhanSo ps1 = new PhanSo(8, 4);
	private static PhanSo ps2 = new PhanSo(5, 6);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tong cua hai phan so ps1 va ps2 la: " + ps1.cong(ps2).toString());
		System.out.println("ps1 toi gian hay chua: " + (ps1.kiemTraToiGian() == true ? "Dung" : "Sai"));
	}

}
