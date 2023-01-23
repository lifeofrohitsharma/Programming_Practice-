package assignment_13_07_2022;

/*WAJP TO PRINT A PATTERN OF DIGITS UPTO N...
 			A A A A A 
 			B B B B B
 			C C C C C
 			D D D D D
 			E E E E E
 */
import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no lines pattern you want :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)// for no of lines we want..
		{
			for (int j = 1; j <= n; j++)// for no of element in line we want..
			{
				System.out.print((char) (i + 64) + " ");// for elements in single line..
			}
			System.out.println();// for next line..
			sc.close();
		}

	}
}
