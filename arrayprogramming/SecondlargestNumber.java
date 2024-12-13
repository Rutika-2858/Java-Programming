package arrayprogramming;

public class SecondlargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {14,34,71,26,85,17};
		int large = Integer.MIN_VALUE;
		int slarge = Integer.MIN_VALUE;
		for (int i = 0; i< a.length; i++) {
			if(a[i] > large) {
				slarge = large;
				large = a[i];
			}else if (a[i] > slarge && a[i] != large) {
				slarge = a[i];
			}
		}
		System.out.println("largest element " + large);
		System.out.println("second largest element " + slarge);
	}
}	

