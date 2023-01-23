package assignment_02_07_2022;

/*WAJP TO READ THE MONTH NUMBER FROM THE USER AND PRINT HOW MANY DAYS IN THAT MONTH*/
import java.util.Scanner;

public class DaysMonthSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month No :");
		int monthno = sc.nextInt();
		switch (monthno) {
		case 1:
			System.out.println("JANUARY: No of days are 31");
			break;
		case 2:
			System.out.println("FEBRUARY: No of days are 28 & 29 in Leap year ");
			break;
		case 3:
			System.out.println("MARCH: No of days are 31");
			break;
		case 4:
			System.out.println("APRIL: No of days are 30");
			break;
		case 5:
			System.out.println("MAY: No of days are 31");
			break;
		case 6:
			System.out.println("JUNE: No of days are 30");
			break;
		case 7:
			System.out.println("JULY: No of days are 31");
			break;
		case 8:
			System.out.println("AUGUST: No of days are 31");
			break;
		case 9:
			System.out.println("SEPTEMBER: No of days are 30");
			break;
		case 10:
			System.out.println("OCTOBER: No of days are 31");
			break;
		case 11:
			System.out.println("NOVEMBER: No of days are 30");
			break;
		case 12:
			System.out.println("DECEMBER: No of days are 31");
			break;
		default:
			System.out.println("NOT A VALID MONTH");
		}
		sc.close();

	}
}
