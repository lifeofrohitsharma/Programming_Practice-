package assignment_05_07_2022;
//DEFINE A METHOD TO RETURN TRUE IF NO IS PERFECT NO, OTHERWISE RETURN FALSE.

import java.util.Scanner;

public class PerfectNo {
	static boolean perfectNo(int x) {
		int sum = 0;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0) {
				sum = sum + i;// 1
			}
		}
		if (sum == x)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		boolean rs = perfectNo(n);
		if (rs == true) {
			System.out.println(rs + "It is a perfect number");
		} else
			System.out.println(rs + "It is not a perfect number");
		sc.close();
	}
}
