package assignment_30_06_2022;

//WAJP TO CHECK WHETHER USER ENTERED INTEGER IS A DIGIT OR NUMBER...?
import java.util.Scanner;

public class DigitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Numerical Value");
		float a = sc.nextFloat();
		if (-9 <= a && a <= 9) {
			System.out.println("it is Digit :" + a);
		} else {
			System.out.println("it is a Number :" + a);
		}
		sc.close();
	}

}
