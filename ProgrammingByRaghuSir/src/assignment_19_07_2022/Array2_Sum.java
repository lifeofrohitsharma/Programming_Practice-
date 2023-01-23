package assignment_19_07_2022;

// DEFINE A METHOD TO RETURN THE SUM OF ARRAY ELEMENTS.
import java.util.Scanner;

public class Array2_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array Elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the " + n + " values of Array :");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		int sum = sumOfArray(ar);
		System.out.println("Sum of Array Elements are :" + sum);
		sc.close();
	}

	static int sumOfArray(int x[]) {
		int total = 0;
		for (int i = 0; i < x.length; i++) {
			total = total + x[i];
		}
		return total;
	}
}
