package programming;

public class DecimaltoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 24;
		String bin = "";
		while (n != 0) {
			int remainder = n % 8;
			bin = remainder + bin;
			n = n/8;
		}
		System.out.println(bin);
	}
	}


