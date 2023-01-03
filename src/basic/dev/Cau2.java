package basic.dev;

import java.util.Scanner;

public class Cau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n = ");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			if (i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("Tong cac so chia het cho ba va be hon " +n+ " la: " +sum);
	}

}
