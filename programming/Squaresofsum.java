//WAP to find the sum of the squares of each digit of the number.
package programming;
import java.util.Scanner;


public class Squaresofsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
//		System.out.println(a);
		while(n != 0) {
			int digit = n % 10;
			sum = sum + (digit * digit);
//			System.out.println(sum);
			n = n/10;	
		}
		System.out.println(sum);		
	}
//	System.out.println(sum);
}
