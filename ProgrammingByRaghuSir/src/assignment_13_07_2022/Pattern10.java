package assignment_13_07_2022;

/*WAJP TO PRINT A PATTERN OF DIGITS UPTO N...
 			A 
			A B 
			A B C
			A B C D 
 */
import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no lines pattern you want :");
		int n = sc.nextInt();
		for (int i = 1; i <= 5; i++)// for no of lines we want..
		{
			for (int j = 1; j <= i; j++)// for no of element in line we want..
			{
				System.out.print((char)(64+i)+ " ");// for elements in single line..
			}
			System.out.println();// for next line..
			sc.close();
		}

	}
}
