//Bài tập: viết chương trình nhập vào từ bàn phím một xâu chỉ họ tên thực hiện
//1. In ra xâu họ tên vừa nhập
//2. Tách từ chỉ họ và từ chỉ tên
//3. In ra xâu đảo ngược 
//4. In ra xâu họ tên tất cả viết bằng chữ in hoa
package tuan5;

import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
		// Nhập họ tên
		System.out.println("Nhập vào họ tên: ");
		Scanner in = new Scanner(System.in);
		String fullname = in.nextLine();

		// Tách từ chỉ họ và từ chỉ tên
		String[] temp = fullname.split("\\s+");
		String lastname = temp[0];
		String firstname = temp[temp.length - 1];

		// In ra
		System.out.println("1. Họ tên đã nhập: " + fullname);
		System.out.println("2. Tách từ chỉ họ và từ chỉ tên:");
		System.out.println("\t Họ: " + lastname);
		System.out.println("\t Tên: " + firstname);

		// Đảo xâu
		System.out.println("3. Xâu họ và tên đảo ngược:");
		StringBuilder reversename = new StringBuilder();
		reversename.append(fullname);
		reversename = reversename.reverse();
		int i;
		System.out.print("\t");
		for (i = 0; i < reversename.length(); i++) {
			System.out.print(reversename.charAt(i));
		}

		// In xâu họ tên bằng tất cả chữ hoa
		System.out.println("\n4. In xâu họ tên bằng tất cả chữ hoa: " + "\n\t" + fullname.toUpperCase());
	}
}
