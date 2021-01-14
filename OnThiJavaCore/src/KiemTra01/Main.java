package KiemTra01;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<LichHop> dsLichHop = new ArrayList<LichHop>(
				Arrays.asList(new LichHop("Ten1", "12:08 15/01/2021", "1:08 15/01/2021", "ddA"),
						new LichHop("Ten2", "12:08 13/01/2021", "1:08 13/01/2021", "ddB")));

		System.out.println("Cac lich dien ra vao thu 6 la: ");
		for (LichHop lh : dsLichHop) {
			if (lh.layThuTrongTuan() == 6) {
				lh.inTT();
			}
		}
	}
}