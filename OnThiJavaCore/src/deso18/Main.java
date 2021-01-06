package deso18;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HCN hcn1 = new HCN(3, 6);
		HCN hcn2 = new HCN(3, 6);
		System.out.printf("Chu vi hình chữ nhật 1 là: %.2f", hcn1.chuVi());
		System.out.printf("\nDiện tích hình chữ nhật 1 là: %.2f", hcn1.dienTich());
		System.out.printf("\nChu vi hình chữ nhật 2 là:  %.2f", hcn2.chuVi());
		System.out.printf("\nDiện tích hình chữ nhật 2 là:  %.2f", hcn2.dienTich());
		System.out.println("\nSo sánh bằng phương thức equals: " + hcn1.equals(hcn2));
		System.out.println("So sánh bằng phương thức compareTo: " + hcn1.compareTo(hcn2));

	}

}
