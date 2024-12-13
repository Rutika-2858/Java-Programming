package programming;
//wap to find the sum of all the odd numbers in the rang 1-10
public class p8 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2 !=0) {
//				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum); 
	}

}
