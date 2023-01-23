package assignment_13_07_2022;

/*WAJP TO PRINT A PATTERN OF DIGITS UPTO N...
 			5 4 3 2 1
 			5 4 3 2 1
 			5 4 3 2 1
 			5 4 3 2 1
 */
import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no lines pattern you want :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)// for no of lines we want..
		{
			for (int j = n; j >= 1; j--)// for no of element in line we want..
			{
				System.out.print(j + " ");// for elements in single line..
			}
			System.out.println();// for next line..
			sc.close();
		}

	}
}
