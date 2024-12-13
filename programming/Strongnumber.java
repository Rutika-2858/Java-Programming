//WAP to find if the number is a strong number or not.
// It's defined as a  number for which the sum of the factorial of its digits equals the number itself.
// Example - 145-> 1!+4!+5! = 1 + 24 + 140 = 145;
package programming;

public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145;
		int sum = 0;
		int temp = n;
		while(n != 0) {
			int digit = n % 10;
//			System.out.println(digit);
//			int factorial=fact(digit);
			sum = sum +fact(digit);
			n = n/10;
			
		}
		if (sum == temp) {
			System.out.println("Strong number");
		}else {
			System.out.println("Not a strong number");
		}
					
		}
	public static int fact(int n) {
		int fact=1;
		for (int i = 1;i<= n ;i++) {
			fact*=i;
		}
		return fact;
		
	}	

}
