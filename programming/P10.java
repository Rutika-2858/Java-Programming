//wap to check number is prime or not using counts;
package programming;
import java.util.Scanner;
public class P10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int n= sc.nextInt();
		int count =1;
		for(int i=1; i<=n/2 ;i++) {
			if(n%i == 0) {
				count= count + 1;
			}
		}
		if(count == 2) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime number");
		}
	}

}
