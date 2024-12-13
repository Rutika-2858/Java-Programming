//wap to check if the number is perfect number or not.
// A perfect number is a number whose sum of the factors excluding the number is equal to the original number.
// Input -6
// Output - Perfect number
package programming;

import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n/2 ; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		if(n == sum) {
			System.out.println("perfect number");
		}else {
			System.out.println("not a perfect number");
		}
	}

}
