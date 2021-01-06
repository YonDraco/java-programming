package deso3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bao extends TaiLieu {
	private Date ngayPH;

	public Bao() {
		super();
	}

	public Bao(String maTL, String tenNXB, int soBPH, Date ngayPH) {
		super(maTL, tenNXB, soBPH);
		this.ngayPH = ngayPH;
	}

	public Date getNgayPH() {
		return ngayPH;
	}

	public void setNgayPH(Date ngayPH) {
		this.ngayPH = ngayPH;
	}

	public Date StringToDate(String dateStr) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = sdf.parse(dateStr);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Sai dinh dang ngay");
		}
		return date;
	}

	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhap ngay phat hanh: ");
		String dateStr = sc.nextLine();
		ngayPH = StringToDate(dateStr);
	}

	public void inTT() {
		super.inTT();
		System.out.print("\nNgay phat hanh: " + ngayPH);
	}
}
