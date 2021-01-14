package deso9;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
	private String hoTen;
	private String MSV;
	private Date ngaySinh;
	private String lop;

	public SinhVien() {
	}

	public SinhVien(String hoTen, String MSV, String ngaySinh, String lop) {
		this();
		this.hoTen = hoTen;
		this.MSV = MSV;
		this.ngaySinh = dateToString(ngaySinh);
		this.lop = lop;

		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			try {
				System.out.println(field.getName() + ": " + field.get(this));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public Date dateToString(String input) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMSV() {
		return MSV;
	}

	public void setMSV(String mSV) {
		MSV = mSV;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String dateToString(Date input) {
		return new SimpleDateFormat("dd/MM/yyyy").format(input);
	}

	public void inTT() {
		System.out.println("Ho va ten: " + hoTen);
		System.out.println("MSV: " + MSV);
		System.out.println("Ngay sinh: " + ngaySinh);
		System.out.println("Lop: " + lop);
	}
}
