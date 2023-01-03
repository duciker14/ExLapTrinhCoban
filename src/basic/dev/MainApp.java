package basic.dev;

import java.util.Scanner;

public class MainApp {
	//cau a
	public static int[] inputArr() {
		Scanner sc = new Scanner(System.in);
		int []x =  new int [10]; // khai bao mang x
		for (int i = 0; i < x.length; i++) {
			System.out.println("Nhap vao man hinh phan tu thu " +(i+1)+ " cua mang: " ); // in ra thong bao nhap vao phan tu thu may
			x[i] = sc.nextInt(); // nhap phan tu thu i cua mang
		}
		return x;
	}
	//cau b
	public static void printArr(int []x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+ ", ");
		}
	}
	//cau c
	public static int sumArr(int []x) { //lam viec vs mang thi alway truyen mang vao
		int sum = 0;
		for (int i = 0; i < x.length; i++) { // luon phai dung for khi duyet mang
			if (x[i]%5 == 0) {
				sum += x[i]; // neu gia tri hien tai khi dang chay vong lap dung la chia het cho 5 thi ms + vs sum
			}
		}
		return sum;
	}
	//cau d
	public static void main(String[] args) {
		int []x =  new int [10]; // khai bao mang x
		x = inputArr(); // ham inputArr tra ve 1 mang -> gan mang do cho x
		printArr(x);
		System.out.println("\nTong la:" +sumArr(x));
	}
	
}
