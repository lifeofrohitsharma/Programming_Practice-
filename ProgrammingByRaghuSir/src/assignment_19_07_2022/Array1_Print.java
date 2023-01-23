package assignment_19_07_2022;

// WAJP TO CREATE THE ARRAY TO STORE THE ELEMENTS AND PRINT FISRT TO LAST AND VICE-VERSA...
import java.util.Scanner;

public class Array1_Print {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enters " + n + " values in array :");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("user entered value from first to last :");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
		System.out.println("user entered value from last to first :");
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.println(ar[i] + " ");
			sc.close();
		}

	}
}
