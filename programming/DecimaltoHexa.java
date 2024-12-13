package programming;

public class DecimaltoHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145234;
		int base = 16;
		String hexa = "";
		while (n != 0) {
			int remainder = n % base;
			if(remainder < 10 ) {
				hexa = remainder + hexa;
			}else {
				hexa = (char) (remainder + 55) + hexa;
			}
			
			n = n/base;
		}
		System.out.println(hexa);
	}
	

}
