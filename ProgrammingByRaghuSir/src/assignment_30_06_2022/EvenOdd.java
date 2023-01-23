package assignment_30_06_2022;

//WAJP TO CHECK WHETHER THE NUMBER ENTERED IS ODD OR EVEN..??
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("The Number is Even :" + a);
		} else {
			System.out.println("Number is Odd");
		}
		sc.close();
	}

}
