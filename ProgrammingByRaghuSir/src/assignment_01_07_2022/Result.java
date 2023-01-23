package assignment_01_07_2022;

/*WAJP to read four subject marks of a student print his result like Pass if he Score >=35 in
all subjects otherwise print fail.*/
import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of Math");
		int math = sc.nextInt();
		System.out.println("Marks in Maths :"+math);
		System.out.println("Enter Marks of Scince");
		int sci = sc.nextInt();
		System.out.println("Marks in Science :"+sci);
		System.out.println("Enter Marks of English");
		int eng = sc.nextInt();
		System.out.println("Marks in English :"+eng);
		System.out.println("Enter Marks of Hindi");
		int hindi = sc.nextInt();
		System.out.println("Marks in Hindi :"+hindi);
		if (math >= 35 && sci >= 35 && eng >= 35 && hindi >= 35)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		sc.close();
	}
}
