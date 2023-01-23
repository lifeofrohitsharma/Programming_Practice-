package assignment_16_07_2022;

/*WAJP TO PRINT A PATTERN OF DIGITS UPTO N...
5 4 3 2 1 
  4 3 2 1 
    3 2 1 
      2 1 
        1  

 			
 */
import java.util.Scanner;

public class MainPtr6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no lines pattern you want :");
		int n = sc.nextInt();// n=5
		int sp = 0;
		int st = 1;
		for (int i = n; i >= 1; i--)// for no of lines we want..
		{
			for (int j = 1; j <= sp; j++)// for space in elements we want..
			{
				System.out.print("  ");
			}
			for (int j = i; j >= st; j--) {
				System.out.print(j + " ");// for elements in single line..
			}
			sp++;
			System.out.println();// for next line..
			sc.close();
		}

	}
}
