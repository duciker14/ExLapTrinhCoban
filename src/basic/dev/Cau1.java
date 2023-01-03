package basic.dev;

import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao hai so nguyen a,b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Tong hai so la: " +(a+b));
		System.out.println("Hieu hai so la: " +Math.abs(a-b));
		System.out.println("Tich hai so la: " +(a*b));
		System.out.println("Thuong hai so la: " +(a/b));
	}

}
