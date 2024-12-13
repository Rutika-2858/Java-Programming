package programming;

public class Gcdp12 {

	public static void main(String[] args) {
		int a=12, b=18;
		int min = Math.min(a, b);
		int gcd =1;
		for (int i =1;i<= min; i++) {
			if(a%i ==0 && b%i ==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
