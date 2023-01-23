package assignment_06_07_2022;

//WAJP METHOD TO RETURN A REVERSE OF A NO....
import java.util.Scanner;

public class ReverseNo {
	static int reverseNo(int x)// 25
	{
		int rno = 0;
		do {
			int d = x % 10;// 5,2
			rno = rno * 10 + d;// 0*10+5=5/5*10+2=52
			x = x / 10;// 2
		} while (x != 0);
		return rno;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		int rno = reverseNo(a);
		System.out.println("Reverse of a number is :" + rno);
		sc.close();
	}
}
