package assignment_13_07_2022;

import java.util.Scanner;

/*WAJP TO PRINT THE PATTERN IN DECREASING ORDER IN UPCOMING LINES FOR N.. * 
*  * 
*  *  * 
*  *  *  * 
*  *  *  *  * 
*  *  *  *  *  *      */
public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of lines of pattern you want :");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) // for no of lines we want..
		{
			for (int j = 1; j <= i; j++)// for no of element in line we want..
			{
				System.out.print(" * ");// for elements in single line..
			}
			System.out.println();// for next line..
			sc.close();
		}
	}
}