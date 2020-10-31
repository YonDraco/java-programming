package baithuchanhso1;

public class TestPS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo ps1 = new PhanSo(3, 5);
		ps1.inPS();
		PhanSo ps2 = new PhanSo(8, 18);
		ps2.inPS();

		PhanSo ps3 = ps1.congPS(ps2);
		PhanSo ps4 = ps1.nhanPhanSo(ps2);
		PhanSo ps5 = ps1.chiaPhanSo(ps2);

		System.out.print("Tổng hai phân số là: ");
		ps3.inPS();
		System.out.println("Tổng hai phân số đã rút gọn chưa: " + ps3.ktToiGian() + "\n");
		System.out.print("Tích hai phân số là: ");
		ps4.inPS();
		System.out.println("Tích hai phân số đã rút gọn chưa: " + ps4.ktToiGian() + "\n");
		System.out.print("Thương hai phân số là: ");
		ps4.inPS();
		System.out.println("Thương hai phân số đã rút gọn chưa: " + ps5.ktToiGian() + "\n");
	}
}
