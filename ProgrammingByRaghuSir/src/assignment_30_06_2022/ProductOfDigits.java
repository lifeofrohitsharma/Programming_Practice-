package assignment_30_06_2022;

//DEFINE A METHOD TO RETURN PRODUCT OF ITS DIGITS.
import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int pro = proOfDigits(n);
		System.out.println("Product of Digits is :" + pro);
		sc.close();
	}

	static int proOfDigits(int x) {
		int pro = 1;
		while (x != 0) {
			int d = x % 10;
			prso = pro * d;
			x = x / 10;
		}
		return pro;
	}
}
