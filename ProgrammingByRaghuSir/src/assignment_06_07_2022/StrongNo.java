package assignment_06_07_2022;

//WAJP TO RETURN TRUE IF THE NO IS STRONG NO, OTHERWISE FALSE.
import java.util.Scanner;

public class StrongNo {
	static int getFact(int x) {
		int fact = 1;
		while (x > 1) {
			fact = fact * x;
			x--;
		}
		return fact;
	}

	static boolean strongNo(int n) {
		int sum = 0, temp = n;
		do {
			int d = n % 10;
			sum = sum + getFact(d);
			n = n / 10;
		} while (n != 0);
		return sum == temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		boolean rs = strongNo(a);
		if (rs == true) {
			System.out.println("It is Strong No :" + rs);
		} else
			System.out.println("Not a Strong no :" + rs);
		sc.close();
	}
}
