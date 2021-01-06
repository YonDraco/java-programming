package deso16;

public class HinhTron {
	private Diem d;
	private int r;

	public HinhTron() {
	};

	public HinhTron(Diem d, int r) {
		this.d = d;
		this.r = r;
	}

	public HinhTron(int r, Diem d) {
		this.r = r;
		this.d = d;
	}

	public float chuVi() {
		return (float) Math.PI * 2 * r;
	}

	public float dienTich() {
		return (float) Math.PI * r * r;
	}

	public static void main(String[] args) {
		Diem d = new Diem(3, 3);
		HinhTron ht = new HinhTron(d, 3);
		System.out.println("Chu vi hình tròn: " + ht.chuVi());
		System.out.println("Diện tích hình tròn: " + ht.dienTich());
	}
}
