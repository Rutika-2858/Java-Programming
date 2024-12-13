package programming;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8208;
//		int count = (int) Math.log10(n) + 1 ; //Total digits in num
		int count = countDigits(n); //Total digits in num
		int sum = 0, temp = n;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + pow(digit, count);
			n = n/10;
		}
		if (sum == temp) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not an armstrong number");
		}
	}
	public static int countDigits(int n) {
		int count = 0;
		while(n != 0) {
			count++;
			n= n/10;
		}
		return count;
	}
	public static int pow (int n, int p) {
		int res = 1;
		for (int i =1; i<= p; i++) {
			res = res *n;
		}
		return res;
	}

}
