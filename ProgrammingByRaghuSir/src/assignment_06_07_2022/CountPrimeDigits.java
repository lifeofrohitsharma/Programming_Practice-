package assignment_06_07_2022;

// WAJP TO DEFINE A METHOD TO PRINT HOW MANY PRIME NO IN DIGITS PRESENTS IN THE NO...
import java.util.Scanner;

public class CountPrimeDigits {
	static int countPrimeNo(int x)// 25
	{
		int count = 0;
		do {
			int d = x % 10;// 5,2
			if (d == 1 || d == 2 || d == 3 || d == 5 || d == 7)
				count++;// 1+1
			x = x / 10;// 2
		} while (x != 0);// false loop will run again
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		int count = countPrimeNo(a);
		System.out.println("No of Prime Digits in the Number are :" + count);
		sc.close();
	}
}
