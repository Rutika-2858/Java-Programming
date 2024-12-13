package arrayprogramming;

public class TASK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a= {{2,4,3}, {7,5,1},{9,8,6}};
		int n = 8;
		int sumRC = 0;
		apple: for(int i= 0; i< a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				if(a[i][j]==n) {
					sumRC = i+j;
					break apple;
				}
			}
		}
		int sum =0;
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(sumRC % 2==0 && a[i][j] % 2 ==0) {
					sum+= sumOfDigits(a[i][j]);
				}else if(sumRC %2 != 0 && a[i][j] % 2 != 0){
					sum += sumOfDigits(a[i][j]);
				}
			}
		}
		System.out.println(sum);
	}
	public static int sumOfDigits(int n) {
		int sum = 0;
		while(n != 0) {
			int digit = n % 10;
			sum += digit;
			n /= 10;
		}
		return sum;
	}
}
