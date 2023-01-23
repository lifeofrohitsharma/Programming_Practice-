package assignment_19_07_2022;

// DAMT RETURN HOW MANY PRIME NO PRESENT IN ARRAY.
import java.util.Scanner;

public class Array6PrimeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of Array You want :");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Insert the Elements in the Array :");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		int count = primeNo(ar);
		System.out.println("Prime No in the Array are :" + count);
		sc.close();
	}

	static int primeNo(int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			boolean rs = isPrime(ar[i]);
			if (rs == true)
				count++;
		}
		return count;
	}

	static boolean isPrime(int x) {
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

}
