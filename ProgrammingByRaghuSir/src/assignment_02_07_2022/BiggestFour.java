package assignment_02_07_2022;
//WAJP TO PRINT THE BIGGEST NUMBER AMONG FOUR NUMBERS WITH USING TERNARY OPERATOR..??

import java.util.Scanner;

public class BiggestFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number :");
		int a = sc.nextInt();
		System.out.println("Enter Second number :");
		int b = sc.nextInt();
		System.out.println("Enter Third number :");
		int c = sc.nextInt();
		System.out.println("Enter Fourth number :");
		int d = sc.nextInt();
		int big=(a>b)?a:b;
			big=(c>big)?c:big;
			big=(d>big)?d:big;
			System.out.println("Biggest is :"+big);
	}
}
