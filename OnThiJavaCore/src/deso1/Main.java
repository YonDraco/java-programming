package deso1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo ps1 = new PhanSo(4, 5);
		PhanSo ps2 = new PhanSo(6, 5);

		PhanSo tong = ps1.cong(ps2);
		System.out.print("Phan so tong cua ps1 va ps2 la: ");
		tong = tong.rutGon();
		tong.inRa();

		PhanSo tru = ps1.tru(ps2);
		System.out.print("\nPhan so hieu cua ps1 va ps2 la: ");
		tru.inRa();
		System.out.println(tru.kiemTraToiGian());

		PhanSo nhan = ps1.nhan(ps2);
		System.out.print("\nPhan so nhan cua ps1 va ps2 la: ");
		nhan.inRa();

		PhanSo chia = ps1.chia(ps2);
		System.out.print("\nPhan so chia cua ps1 va ps2 la: ");
		chia.inRa();
	}

}

//tong.tuSo = 5
//tong.mauSo = 10
//
//tong.rutGon
//{
//	int ucln = ucln(tong.tuSo, tong.mauSo);
//	int tuSoMoi = tong.tuSo / ucln;
//	int mauSoMoi = tong.mauSo / ucln;
//}
