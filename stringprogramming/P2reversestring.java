package stringprogramming;

public class P2reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "icecream";
		String rev = "";
		
		for(int i=s.length() - 1 ; i >= 0 ; i--) {
			rev += s.charAt(i);
		}
		System.out.println(rev);
	}

}
