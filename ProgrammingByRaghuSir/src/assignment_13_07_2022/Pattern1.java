package assignment_13_07_2022;

/*WAJP TO PRINT A PATTERN OF DIGITS UPTO N...
 			*  *  * 
 			*  *  * 
 			*  *  * 
 */
import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no lines pattern you want :");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++)// for no of lines we want..
		{
			for (int j = 1; j <= a; j++)// for no of element in line we want..
			{
				System.out.print(" * ");// for elements in single line..
			}
			System.out.println();// for next line..
			sc.close();
		}

	}
}
