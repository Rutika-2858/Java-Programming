package programming;
//wap programm to separate the digit 
public class Separation_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 345;
		while(n!= 0) {
			int digit = n % 10;
			System.out.println(digit);
			n = n/10;
		}
	}

}
