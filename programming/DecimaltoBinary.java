//WAP to convert Decimal to Binary.
package programming;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 24;
		String bin = "";
		while (n != 0) {
			int remainder = n % 2;
			bin = remainder + bin;
			n = n/2;
		}
		System.out.println(bin);
	}

}
