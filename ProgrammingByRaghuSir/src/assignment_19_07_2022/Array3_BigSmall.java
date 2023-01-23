package assignment_19_07_2022;

// DEFINE A METHOD TO RETURN THE BIGGEST VALUE FROM THE ARRAY.
import java.util.Scanner;

public class Array3_BigSmall {
	int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int n = sc.nextInt();
		System.out.println("Enter the " + n + " value of Array :");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		return ar;

	}

	void dispArray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
		System.out.println();
	}

	int BiggestNo(int ar[]) {
		int big = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > big)
				big = ar[i];
		}
		return big;
	}

	int SmallestNo(int ar[]) {
		int small = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < small) {
				small = ar[i];
			}
		}
		return small;
	}
}
