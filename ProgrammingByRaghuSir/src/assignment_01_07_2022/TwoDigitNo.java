package assignment_01_07_2022;

/*WAJP READ THE INTEGER VALUE FROM USER AND PRINT WHETHER IT IS A TWO DIGIT NUMBER OR NOT..?*/
import java.util.Scanner;

public class TwoDigitNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number :");
		int a = sc.nextInt();
		if (a<=-10 && a>=-99 || a >= 10 && a<=99)
			System.out.println("it ia a two digit no :" + a);
		else
			System.out.println("Not a two digit no :" + a);
		sc.close();

	}
}
