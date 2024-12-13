package programming;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n = 9;
		int sum = 0;
		int add = 0;
		while(n != 0) {
			int digit = n % 10;
			sum = sum + (digit * digit);
			n = n/10;
			
		}
		System.out.println(sum);
	}
	public static int sumofSquare(int sum) {
		while (sum != 0) {
			int digit  = sum % 10;
//			System.out.println(sum);
			add += sum;
			sum /= 10;
			
		}
		return add;
	}

}
