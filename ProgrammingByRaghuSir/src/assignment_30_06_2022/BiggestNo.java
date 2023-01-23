package assignment_30_06_2022;

import java.util.Scanner;

//WAJP TO PRINT THE BIGGEST NUMBER AMONG THREE NUMBERS WITH USING SIMPLE IF..??
public class BiggestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		System.out.println("Bigest no is :"+big);
		sc.close();
	}

}
