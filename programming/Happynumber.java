package programming;

public class Happynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 37;
		while (n != 1 && n != 4) {
			n = sumofSquares(n);
		}
		if (n == 1) {
			System.out.println("Happy number");
		}else {
			System.out.println("Not a Happy number");
		}
	}
	public static int sumofSquares(int n) {
		int sum = 0;
		while(n != 0) {
			int digit = n % 10;
			sum += (digit * digit);
			n = n/10;
		}
		return (sum);
	}

}
