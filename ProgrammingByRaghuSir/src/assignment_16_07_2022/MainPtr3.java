package assignment_16_07_2022;

/*WAJP TO PRINT A PATTERN OF DIGITS UPTO N...
             * 
          *  * 
       *  *  * 
    *  *  *  * 
 *  *  *  *  *  
 			
 */
import java.util.Scanner;

public class MainPtr3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no lines pattern you want :");
		int n = sc.nextInt();
		int sp = n - 1;
		int st = 1;
		for (int i = 1; i <= n; i++)// for no of lines we want..
		{
			for (int j = 1; j <= sp; j++)// for space in elements we want..
			{
				System.out.print("   ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print(" * ");// for elements in single line..
			}
			sp--;
			st = st + 1;
			System.out.println();// for next line..
			sc.close();
		}

	}
}
