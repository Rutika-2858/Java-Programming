package stringprogramming;

public class FirstD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "welcome";
		String s2 = "welcome";
		String s3 = "welcome";
		
		String s4 = new String ("welcome");
		String s5 = new String ("welcome");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s4 == s5);
		System.out.println(s1.equals(s5));
	}

}
