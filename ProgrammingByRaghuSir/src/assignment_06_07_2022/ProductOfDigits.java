package assignment_06_07_2022;
//WAMT RETURN PRODUCT OF ITS DIGITS.
import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no :");
		int a=sc.nextInt();
		int pro= proOfDigits(a);
		System.out.println("Product of Digits is :"+ pro);
		sc.close();
	}
	static int proOfDigits(int x)
	{
		int pro=1;
		while(x!=0)
		{
			int d=x%10;
			pro =pro*d;
			x=x/10;
		}
		return pro;
	}
}
