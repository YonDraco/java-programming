package tuan4;

import java.util.Scanner;

public class Bai3Chuong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nhập hai số thực
		System.out.println("Nhập vào hai số thực: ");
		Scanner in = new Scanner(System.in);
		float a = in.nextFloat();
		float b = in.nextFloat();
		
		System.out.println("Nhập lựa chọn của bạn"+ "\n1. Tính tổng" +"\n2. Tính hiệu" + "\n3. Tính tích"+ "\n4. Tính thương");
		int luachon = in.nextInt();
		switch (luachon) {
		case 1:
			System.out.print("Tổng hai số là: ");
			System.out.println(a+b);
			break;
		case 2:
			System.out.print("Hiệu hai số là: ");
			System.out.println(a-b);
			break;
		case 3:
			System.out.print("Tích hai số là: ");
			System.out.println(a*b);
			break;
		case 4:
			System.out.print("Thương hai số là: ");
			System.out.println(a/b);
			break;
		default:
			System.out.println("Lựa chọn sai mời chọn lại!!!");
			break;
		}
	}
}
