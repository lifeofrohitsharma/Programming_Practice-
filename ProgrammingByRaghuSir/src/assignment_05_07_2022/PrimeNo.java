package assignment_05_07_2022;
//DEFINE A METHOD TO RETURN TRUE IF NO IS PRIME NO, OTHERWISE RETURN FALSE.

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		boolean rs = primeNo(n);
		if (rs == true) {
			System.out.println("It is a prime number" +" "+rs);
		} else
			System.out.println("It is not a prime number" +" "+rs);
		sc.close();
	}

	static boolean primeNo(int x) {
		for (int i = 2; i < x / 2; i++) {
			{
				if (x % i == 0)
					return false;
			}
		}
		return true;
	}
}
