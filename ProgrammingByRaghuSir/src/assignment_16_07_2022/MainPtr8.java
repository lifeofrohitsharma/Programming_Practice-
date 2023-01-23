package assignment_16_07_2022;

/*WAJP TO PRINT A PATTERN OF DIGITS UPTO N...
        1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5  

 			
 */
import java.util.Scanner;

public class MainPtr8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no lines pattern you want :");
		int n = sc.nextInt();// n=5
		int sp = n - 1;
		int st = 2 * n + 1;
		for (int i = 1; i <= n; i++)// for no of lines we want..
		{
			for (int j = 1; j <= sp; j++)// for space in elements we want..
			{
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");// for elements in single line..
			}
			sp--;
			System.out.println();// for next line..
			sc.close();
		}

	}
}
