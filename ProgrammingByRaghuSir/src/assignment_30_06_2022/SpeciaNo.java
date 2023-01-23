package assignment_30_06_2022;

//WAJP check user enter number is special two digit  number
import java.util.Scanner;

class SpeciaNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int a = sc.nextInt();
		int b = a / 10;
		int c = a % 10;
		int sum = b + c + b * c;
		if (sum == a) {
			System.out.println("This is a Special Number :" + a);
		} else {
			System.out.println("Not a Special number :" + a);
		}
		sc.close();
	}
}
