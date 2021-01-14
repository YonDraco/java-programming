package deso15;

public class TestTG {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem A = new Diem();
		Diem B = new Diem(3, 0);
		Diem C = new Diem(0, 4);

		TamGiac tg = new TamGiac(A, B, C);
		System.out.print("Toạ độ điểm A: ");
		A.inDiem();
		System.out.print("Toạ độ điểm B: ");
		B.inDiem();
		System.out.print("Toạ độ điểm C: ");
		C.inDiem();
		System.out.println("Chu vi: " + tg.chuVi());
		System.out.println("Diện tích: " + tg.dienTich());
	}
}
