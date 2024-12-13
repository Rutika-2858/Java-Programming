package programming;

public class SUMOFPRIME {

	public static void main(String[] args) {
		int n = 567;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
//			System.out.println(digit);
//			n = n/10;
//			if (digit % 2 != 0) {
////				System.out.println(digit);
//				sum += digit;
			if (digit ==2 || digit == 3|| digit == 5|| digit == 7) {
				sum += digit;
			}
			n /= 10;
		}
		System.out.println(sum);
	}

}
