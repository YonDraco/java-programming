package deso15;

public class Diem {
	float x;
	float y;

	public Diem() {
		x = 0;
		y = 0;
	}

	public Diem(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float kc(Diem d) {
		float kc = (float) Math.sqrt((x - d.x) * (x - d.x) + (y - d.y) * (y - d.y));
		return kc;
	}

	public void inDiem() {
		int xm = (int) x;
		int ym = (int) y;

		System.out.println("(" + xm + ";" + ym + ")");
	}
}
