package assignment_13_07_2022;

/*WAJP TO PRINT A PATTERN OF DIGITS UPTO N...
 			*  *  * 
 			*  *  * 
 			*  *  * 
 */
import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no lines pattern you want :");
		int a = sc.nextInt();
		for (int i = 1; i<= a; i++)// for no of lines we want..
		{
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 2 * a - 1; j >=a-1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}