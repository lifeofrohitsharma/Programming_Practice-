package assignment_02_07_2022;
//WAJP TO READ THREE DISTINCT VALUE FROM THE USER AND PRINT THE MIDLLE ONE..??

import java.util.Scanner;

public class Middlevalue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number :");
		int a = sc.nextInt();
		System.out.println("Enter Second number :");
		int b = sc.nextInt();
		System.out.println("Enter Third number :");
		int c = sc.nextInt();
		if (a>b && a < c) {
			System.out.println("Middle Number is :" + a);
		} else if (b > a && b < c) {
			System.out.println("Middle Number is :" + b);
		} /*else if (c > a && c < b) {
			System.out.println("Middle Number is :" + c);
		}*/
		else
			System.out.println("middle no is: "+c);
		sc.close();
	}

}
