package assignment_19_07_2022;

public class Array3_Big_Small_Execution {
	public static void main(String[] args) {
		Array3_BigSmall ob = new Array3_BigSmall();
		int x[] = ob.readArray();
		System.out.println("User Entered Array Elements are :");
		ob.dispArray(x);
		System.out.println("Biggest No among the Array Elements is :" + ob.BiggestNo(x));
		System.out.println("Smallest No among the Array Elements is :" + ob.SmallestNo(x));

	}
}
