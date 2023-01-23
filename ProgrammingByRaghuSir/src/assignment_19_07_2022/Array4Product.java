package assignment_19_07_2022;

// DAMT RETURN THE PRODUCT OF ARRAY ELEMENTS...
import java.util.Scanner;

public class Array4Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the elements inside Array :");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int pro = proOfArray(ar);
		System.out.println("Product of Array elements is :" + pro);
		sc.close();
	}

	static int proOfArray(int x[]) {
		int pro = 1;
		for (int i = 0; i < x.length; i++) {
			pro = pro * x[i];
		}
		return pro;

	}
}
