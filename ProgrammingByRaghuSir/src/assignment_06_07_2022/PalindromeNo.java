package assignment_06_07_2022;

//WAJP TO CHECK THE NO IS PALINDROME RETURN TRUE OTHERWISE FALSE....
import java.util.Scanner;

public class PalindromeNo {
	static boolean palindromeNo(int x) {
		int rev = 0, temp = x;
		do {
			int d = x % 10;
			rev = rev * 10 + d;
			x = x / 10;
		} while (x != 0);
		return rev == temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		boolean rs = palindromeNo(a);
		if (rs == true) {
			System.out.println("It is palindrome No :" + rs);
		} else
			System.out.println("Not a palindrome no :" + rs);
		sc.close();
	}
}
