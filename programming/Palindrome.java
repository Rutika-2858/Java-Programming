package programming;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		int temp = n;
		int rev = 0;
		while(n != 0) {
			int digit = n%10;
			rev = rev*10 + digit;
			n = n /10;
		}
		if (rev == temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}

}
