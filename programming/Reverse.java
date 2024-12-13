package programming;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123;
		int rev = 0;
		while(n != 0) {
			int digit = n%10;
			rev = rev*10 + digit;
			n = n /10;
		}
		System.out.println(rev);
	}

}
