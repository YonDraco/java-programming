package tuan4;

import java.util.Scanner;

public class Bai2Chuong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char xeploai = 0;
		System.out.println("Nhập điểm thi của sinh viên: ");
		Scanner in = new Scanner(System.in);
		int diem = in.nextInt();
		
		if(diem>=90) {
			xeploai = 'A';
		}else if(diem>=80) {
			xeploai = 'B';
		}else if(diem>=70) {
			xeploai = 'C';
		}else if(diem>=60) {
			xeploai = 'D';
		}else if(diem>=0) {
			xeploai = 'F';
		}else {
			System.out.println("Điểm thi đã nhập không hợp lệ!!!");
		}
		System.out.println("Điểm thi đã nhập xếp loại: "+ xeploai);
	}
}
