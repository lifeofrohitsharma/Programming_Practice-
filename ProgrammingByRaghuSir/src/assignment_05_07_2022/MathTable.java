package assignment_05_07_2022;

//WAJP TO TO PRINT MATH TABLE OF USER ENTERED NO.
import java.util.Scanner;

public class MathTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number of which Table you want ");
		int n=sc.nextInt();
		printMathtable(n);
		sc.close();
		
	}
	static void printMathtable(int x)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(x +" * " +i +"= " +x*i);
		}
	}
}
