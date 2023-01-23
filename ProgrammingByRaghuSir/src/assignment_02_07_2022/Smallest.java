package assignment_02_07_2022;
//WAJP TO PRINT THE SMALLEST NUMBER AMONG THREE NUMBERS WITH USING SIMPLE ..??

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number :");
		int a = sc.nextInt();
		System.out.println("Enter Second number :");
		int b = sc.nextInt();
		System.out.println("Enter Third number :");
		int c = sc.nextInt();
		if (a < b && b < c)
			System.out.println("Smallest is :" + a);
		else if (b < c)
			System.out.println("Smallest is :" + b);
		else
			System.out.println("Smallest is :" + c);
		sc.close();
	}

}
