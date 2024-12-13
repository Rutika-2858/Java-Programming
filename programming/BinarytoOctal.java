package programming;

public class BinarytoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 1101;
		int sum = 0;
		int p = 0;
		
		while(n != 0) {
			int digit = n % 10;
			sum += digit * pow(2,p);
			p++;
			n = n/10;
		}
		String bin = "";
		while(sum != 0) {
			int remainder = sum % 8;
			bin = remainder + bin;
			sum = sum/8;
		
	}
		System.out.println(bin);
	}
	public static int pow(int n, int p) {
		int res = 1;
		for(int i = 1; i<= p;i++) {
			res = res* n;
		}
		return res;
	}

}
