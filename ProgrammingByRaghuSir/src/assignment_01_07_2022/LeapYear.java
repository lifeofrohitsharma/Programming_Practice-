package assignment_01_07_2022;

// WAJP TO CHECK ENTERED YEAR NO IS LEAP YEAR OR NOT..??
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year ");
		int a = sc.nextInt();
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("It is a Leap year");
		} else
			System.out.println("Not a Leap year");
		sc.close();

	}

}
