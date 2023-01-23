package assignment_06_07_2022;

// WAJP TO PRINT HOW MANY EVEN AND ODD DIGIT PRESENT IN THAT NO....
import java.util.Scanner;

public class PrintEvenOddDigits {
	static void countEvenOdd(int x) {
		int ec = 0, oc = 0;

		do {
			int d = x % 10;
			if (d % 2 == 0)
				ec++;
			else
				oc++;
			x = x / 10;
		} while (x != 0);
		System.out.println("No of even digits are :" + ec);
		System.out.println("No of even digits are :" + oc);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		int a = sc.nextInt();
		countEvenOdd(a);
		sc.close();

	}
}
