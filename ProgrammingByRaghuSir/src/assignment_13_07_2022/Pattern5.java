package assignment_13_07_2022;

/*WAJP TO PRINT A PATTERN OF DIGITS UPTO N...
 			1 0 1 0 1 
 			1 0 1 0 1
 			1 0 1 0 1
 			1 0 1 0 1
 */
import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no lines pattern you want :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)// for no of lines we want..
		{
			for (int j = 1; j <= n; j++)// for no of element in line we want..
			{
				System.out.print(j % 2 + " ");// for elements in single line..
			}
			System.out.println();// for next line..
			sc.close();
		}

	}
}
