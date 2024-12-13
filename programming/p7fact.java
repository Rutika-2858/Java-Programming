package programming;
import java.math.BigInteger;
public class p7fact {

	public static void main(String[] args) {
		int n=8;
//		BigInteger fact = BigInteger.valueOf(i);
		BigInteger fact = BigInteger.ONE;
		for(int i=1; i<=8;i++) {
			BigInteger x = BigInteger.valueOf(i);
			fact = fact.multiply(x);
		}
		System.out.println(fact);
	}

}
