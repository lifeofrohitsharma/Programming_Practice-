package assignment_05_07_2022;

import java.util.Scanner;

// DEFINE A METHOD TO PRINT THE SUMOF EVEN NO & ODD NUMBER PRESET WITHIN IN N.
public class SumEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no till where you want the Sum of Even and Odd number");
		int n = sc.nextInt();
		printSumOfEvenOdd(n);
		sc.close();
	}

	static void printSumOfEvenOdd(int x) {
		int es = 0, os = 0;
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0)
				es = es + i;
			else
				os = os + i;
		}
		System.out.println("Sum of Even No is :" + es);
		System.out.println("Sum of odd No is :" + os);

	}
}
