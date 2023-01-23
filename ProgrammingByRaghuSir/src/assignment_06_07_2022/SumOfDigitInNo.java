package assignment_06_07_2022;

import java.util.Scanner;

//WAJP TO CALCULATE THE SUM OF DIGITS IN A NO:
public class SumOfDigitInNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int sum = sumOfDigits(n);
		System.out.println("Sum of Digits is :" + sum);
		sc.close();
	}

	static int sumOfDigits(int x) {
		int sum = 0;
		while (x != 0) {
			int d = x % 10;
			sum = sum + d;
			x = x / 10;
		}
		return sum;
	}

}
