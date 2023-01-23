package assignment_19_07_2022;

import java.util.Scanner;

public class Array5Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the elements inside Array :");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int[] rev = reverse(ar);
		for (int i = 0; i < rev.length; i++) {
			System.out.println("Reverse of Array elements  :" + rev[i]);
		}
		sc.close();
	}

	void dispArray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
		System.out.println();
	}

	static int[] reverse(int x[]) {
		int j=0;
		int[] rev = new int[x.length];
		;
		for (int i = x.length - 1; i >= 0; i--) {
			rev[j] = x[i];
			j++;
		}
		return rev;
	}

}
