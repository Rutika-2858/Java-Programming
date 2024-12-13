package arrayprogramming;

//import java.util.Scanner;

public class SumofPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {27,31,85,71,17};
		int sum = 0;
		for (int i :a) {
			if(isPrime(i)) {
				sum +=i;
			}
		}
		System.out.println(sum);
		
	}
	public static boolean isPrime(int n) {
		int count = 1;
		for (int i=1;i<= n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count ==2;
	}

}
