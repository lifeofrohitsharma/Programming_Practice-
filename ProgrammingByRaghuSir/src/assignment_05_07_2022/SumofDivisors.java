package assignment_05_07_2022;
import java.util.Scanner;

// DEFINE A METHOD TO RETURN THE SUM OF ITS DEVISORS.
public class SumofDivisors {

	static int sumOfDivisors(int x)
	{
		int sum=0;
		for(int i=1;i<=x/2;i++)
		{
			if(x%i==0)
				sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any integer");
		int n=sc.nextInt();
	int	sum= sumOfDivisors(n);
	System.out.println("Sum of Divisors " +n +" is " +sum);	
	sc.close();
	}
}
