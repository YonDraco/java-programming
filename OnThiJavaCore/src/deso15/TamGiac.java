package deso15;

public class TamGiac {
	private Diem A;
	private Diem B;
	private Diem C;

	public TamGiac() {
	}

	public TamGiac(Diem A, Diem B, Diem C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}

	public float dienTich() {
		float AB = (float) A.kc(B);
		float BC = (float) B.kc(C);
		float AC = (float) C.kc(A);

		float p = (AB + BC + AC) / 2;
		float dt = (float) Math.sqrt(p * (p - AB) * (p - BC) * (p - AC));
		return dt;
	}

	public float chuVi() {
		float AB = (float) A.kc(B);
		float BC = (float) B.kc(C);
		float AC = (float) C.kc(A);
		float CV = AB + BC + AC;
		return CV;
	}
}
