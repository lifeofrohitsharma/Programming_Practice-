package assignment_30_06_2022;

//WAJP to check user enter no is Negative or positive
import java.util.Scanner;

class NegativePositive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		float a = sc.nextFloat();
		if (a > 0) {
			System.out.println("The given no is positive :" + a);
		} else if (a < 0) {
			System.out.println("The given no is Negative :" + a);
		} else if (a == 0) {
			System.out.println("Not an valid integer it is nuteral" + a);
		} else {
			System.out.println("Number not exist");
		}
		sc.close();
	}

}
