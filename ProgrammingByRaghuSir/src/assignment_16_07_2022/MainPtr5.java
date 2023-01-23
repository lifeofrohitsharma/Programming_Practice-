package assignment_16_07_2022;

/*WAJP TO PRINT A PATTERN OF DIGITS UPTO N...
1 2 3 4 5 
  2 3 4 5 
    3 4 5 
      4 5 
        5 

 			
 */
import java.util.Scanner;

public class MainPtr5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no lines pattern you want :");
		int n = sc.nextInt();
		int sp = 0;
		int st = n + 1 - 1;
		for (int i = 1; i <= n; i++)// for no of lines we want..
		{
			for (int j = 1; j <= sp; j++)// for space in elements we want..
			{
				System.out.print("  ");
			}
			for (int j = i; j <= st; j++) {
				System.out.print(j + " ");// for elements in single line..
			}
			sp++;
			st = st--;
			System.out.println();// for next line..
			sc.close();
		}

	}
}
