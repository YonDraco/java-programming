package deso1;

public class PhanSo {

	private int tuSo;
	private int mauSo;

	public PhanSo() {

	}

	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	public PhanSo cong(PhanSo ps) {
		// Tinh tong
		PhanSo tong = new PhanSo();
		tong.tuSo = (this.tuSo * ps.mauSo + ps.tuSo * this.mauSo);
		tong.mauSo = this.mauSo * ps.mauSo;

		return tong;

		// return new PhanSo((this.tuSo * ps.mauSo + ps.tuSo * this.mauSo),
		// (this.mauSo*ps.mauSo));
	}

	public PhanSo tru(PhanSo ps) {
		// Tinh hieu
		PhanSo hieu = new PhanSo();
		hieu.tuSo = (this.tuSo * ps.mauSo - ps.tuSo * this.mauSo);
		hieu.mauSo = this.mauSo * ps.mauSo;

		return hieu;
	}

	public PhanSo nhan(PhanSo ps) {
		// Tinh tich
		PhanSo tich = new PhanSo();
		tich.tuSo = (this.tuSo * ps.tuSo);
		tich.mauSo = (this.mauSo * ps.mauSo);
		return tich;
	}

	public PhanSo chia(PhanSo ps) {
		// Tinh thuong
		PhanSo thuong = new PhanSo();
		thuong.tuSo = (this.tuSo * ps.mauSo);
		thuong.mauSo = (this.mauSo * ps.tuSo);
		return thuong;
	}

	public int ucln(int a, int b) {
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}

		return b;
	}

	public boolean kiemTraToiGian() {
		return this.ucln(tuSo, mauSo) == 1;
	}

	public PhanSo rutGon() {
		if (kiemTraToiGian()) {
			return this;
		} else {
			int ucln = this.ucln(this.tuSo, this.mauSo);
			int tuSoMoi = this.tuSo / ucln;
			int mauSoMoi = this.mauSo / ucln;

			return new PhanSo(tuSoMoi, mauSoMoi);

//			int ucln = this.ucln(this.tuSo, this.mauSo);
//			this.tuSo = this.tuSo / ucln;
//			this.mauSo = this.mauSo / ucln;
//			
//			return this;
		}
	}

	public void inRa() {
		System.out.print(this.tuSo + "/" + this.mauSo);
	}
}
