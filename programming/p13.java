package programming;
//wap to print all the even digits from the number
public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 477621;
		while(n != 0) {
			int digit = n % 10;
			if(n % 2 ==0) {
				
				System.out.println(digit);
			}
			n = n/10;
		}
	}

}
