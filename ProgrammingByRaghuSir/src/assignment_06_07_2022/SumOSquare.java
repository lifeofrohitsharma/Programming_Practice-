package assignment_06_07_2022;
//WAJP DEFINE A METHOD TO RETURN THE SUM OF SQUARE OF ITS DIGITS.
import java.util.Scanner;

public class SumOSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		int sum=squareOfDigits(n);
		System.out.println("Sum of Digits is :"+sum);
		sc.close();
	}
		static int squareOfDigits(int x)
		{
			int sum=0;
			while(x!=0)
			{
				int d=x%10;
				sum=sum+d*d;
				x=x/10;
			}
			return sum;
		}
}
