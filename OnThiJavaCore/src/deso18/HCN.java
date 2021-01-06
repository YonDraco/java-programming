package deso18;

public class HCN implements Comparable {
	private float chieuDai;
	private float chieuRong;

	public HCN() {
	}

	public HCN(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public float getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}

	public float chuVi() {
		return (chieuRong + chieuDai) * 2;
	}

	public float dienTich() {
		return (chieuRong * chieuDai);
	}

	@Override
	public boolean equals(Object obj) {
		HCN hcn = (HCN) obj;
		return (this.chieuDai == hcn.chieuDai) && (this.chieuRong == hcn.chieuRong);
	}

	public boolean compareTo(HCN hcn) {
		return this.dienTich() == hcn.dienTich();
	}
}
