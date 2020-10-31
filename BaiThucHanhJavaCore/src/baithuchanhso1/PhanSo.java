package baithuchanhso1;

public class PhanSo {
	int ms;
	int ts;

	public PhanSo() {
		this.ts = 0;
		this.ms = 1;
	}

	public PhanSo(int ts, int ms) {
		this.ts = ts;
		this.ms = ms;
	}

	// Cong phan so ps1 + ps2
	public PhanSo congPS(PhanSo ps) {
		int tsm = ts * ps.ms + ps.ts * ms;
		int msm = ps.ms * ms;
		return new PhanSo(tsm, msm).rutGonPS();
	}

	// Nhan hai phan so
	public PhanSo nhanPhanSo(PhanSo ps) {
		int tsm = ts * ps.ts;
		int msm = ms * ps.ms;
		return new PhanSo(tsm, msm);
	}

	// Chia hai phan so
	public PhanSo chiaPhanSo(PhanSo ps) {
		int tsm = ts * ps.ms;
		int msm = ms * ps.ts;
		return new PhanSo(tsm, msm).rutGonPS();
	}

	public int ucln(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else
				b = b - a;
		}
		return b;
	}

	// Rut gon phan so
	public PhanSo rutGonPS() {
		int ucln = ucln(ts, ms);
		int tsm = ts / ucln;
		int msm = ms / ucln;
		return new PhanSo(tsm, msm);
	}

	public boolean ktToiGian() {
		int ucln = ucln(ts, ms);
		if (ucln == 1) {
			return true;
		}
		return false;
	}

	public void inPS() {
		System.out.println(ts + "/" + ms);
	}
}
