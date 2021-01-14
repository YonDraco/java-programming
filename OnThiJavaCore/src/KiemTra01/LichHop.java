package KiemTra01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LichHop {
	private String ten;
	private Date tgBatDau;
	private Date tgKetThuc;
	private String diaDiem;

	public LichHop() {
	}

	public LichHop(String ten, String tgBatDau, String tgKetThuc, String diaDiem) {
		this.ten = ten;
		this.tgBatDau = this.stringToDate(tgBatDau);
		this.tgKetThuc = this.stringToDate(tgKetThuc);
		this.diaDiem = diaDiem;
	}

	private Date stringToDate(String input) {
		try {
			return new SimpleDateFormat("HH:mm dd/MM/yyyy").parse(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Loi xay ra khi chuyen tu thoi gian String sang dang Date");
			e.printStackTrace();
			return null;
		}
	}

	public int layThuTrongTuan() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(tgBatDau);
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	private String dateToString(Date input) {
		return new SimpleDateFormat("HH:mm dd/MM/yyyy").format(input);
	}

	public void inTT() {
		System.out.println("Ten lich hop: " + this.ten);
		System.out.println("Thoi gian bat dau: " + this.dateToString(this.tgBatDau));
		System.out.println("Thoi gian ket thuc: " + this.dateToString(this.tgKetThuc));
		System.out.println("Dia diem: " + this.diaDiem);
	}
}
