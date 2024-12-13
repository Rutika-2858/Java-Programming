//wap to find the sum of all the digits of the number.
package programming;

public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 345;
		int sum = 0;
		while(n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n /10;
			
			
		}
		System.out.println(sum);
	}

}
