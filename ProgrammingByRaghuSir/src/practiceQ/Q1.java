package practiceQ;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 941123;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				sum = sum + rem;
			}
			num = num / 10;
		}
		System.out.println("Sum of Odd no is:" + sum);
	}

}
