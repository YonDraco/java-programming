package de1;

public class PhanSo {
	private int tuSo;
	private int mauSo;

	// constructor
	public PhanSo() {
	}

	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	// cac phep toan
	public PhanSo cong(PhanSo ps) {
		int tuSoTong = this.tuSo * ps.mauSo + this.mauSo * ps.mauSo;
		int mauSoTong = this.mauSo * ps.mauSo;
		return new PhanSo(tuSoTong, mauSoTong).toiGian();
	}

	private int ucln(int a, int b) {
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}

	// ham kiem tra toi gian
	public boolean kiemTraToiGian() {
		return ucln(tuSo, mauSo) == 1;
	}

	public PhanSo toiGian() {
		int ucln = ucln(this.tuSo, this.mauSo);
		return new PhanSo(this.tuSo / ucln, this.mauSo / ucln);
	}

	@Override
	public String toString() {
		return this.tuSo + "/" + this.mauSo;
	}
}
