package practiceQ;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My name is ram";
		String[] s1 = s.split(s);
		//String s2 = "";
		for (int i = 0; i < s1.length; i++) {
			String var = s1[i];
			for (int j = var.length() - 1; j > 0; j--) {
				System.out.println(var);
			}
		}
	}

}
