package arrayprogramming;
//Sum of average values present in array.
public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1 ,4, 3, 4};
		int large =Integer.MIN_VALUE; 
		int small = Integer.MAX_VALUE;
		for(int i = 0; i< a.length;i++) {
			if(a[i] > large) {
				large = a[i];
			}
			if(a[i] < small) {
				small = a[i];
			}
			
		}
		float sum = 0.0f , count = 0.0f;
		for(int i = 0; i<a.length;i++) {
			if(a[i] == large || a[i] == small) {
				sum += a[i];
				count++;
			}
		}
		System.out.println(sum / count);
	}

}
