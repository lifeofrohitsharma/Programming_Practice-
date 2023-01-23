package assignment_07_07_2022;

// WAJP TO RETURN TRUE IF THE NO IS ARMSTRONG NO AND FALSE IF IT IS NOT.
import java.util.Scanner;

public class ArmstrongNo {
	static boolean isArmstrong(int x) {
		int sum = 0, temp = x;
		int dc = countDigits(x);
		do {
			int d = x % 10;
			sum = sum + pow(d, dc);
			x = x / 10;
		} while (x != 0);
		return sum == temp;
	}

	static int countDigits(int n) {
		int count = 0;
		do {
			count++;
			n = n / 10;
		} while (n != 0);
		return count;
	}

	static int pow(int n, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		return pw;
	}

	public static void main(String[] args) {
		System.out.println("Enter any Number :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean rs = isArmstrong(a);
		if (rs == true)
			System.out.println("It is an Armstrong No :");
		else
			System.out.println("It is not an Armstrong No: ");
		sc.close();
	}

}
