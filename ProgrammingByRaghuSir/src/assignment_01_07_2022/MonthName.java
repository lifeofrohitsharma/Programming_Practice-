package assignment_01_07_2022;

/*WAJP READ THE MONTH NUMBER FROM THE USER AND PRINT THE CORROSPONDING MONTH NUMBER*/
import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Number :");
		int monthno = sc.nextInt();
		switch (monthno) {
		case 1:
			System.out.println("Month is JANUARY");
			break;
		case 2:
			System.out.println("Month is FEBRUARY");
			break;
		case 3:
			System.out.println("Month is MARCH");
			break;
		case 4:
			System.out.println("Month is APRIL");
			break;
		case 5:
			System.out.println("Month is MAY");
			break;
		case 6:
			System.out.println("Month is JUNE");
			break;
		case 7:
			System.out.println("Month is JULY");
			break;
		case 8:
			System.out.println("Month is AUGUST");
			break;
		case 9:
			System.out.println("Month is SEPTEMBER");
			break;
		case 10:
			System.out.println("Month is OCTOBER");
			break;
		case 11:
			System.out.println("Month is NOVEMBER");
			break;
		case 12:
			System.out.println("Month is DECEMBER");
			break;
		default:
			System.out.println("NOT A VALID MONTH");
		}
		sc.close();

	}

}
