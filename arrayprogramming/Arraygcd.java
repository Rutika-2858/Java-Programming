package arrayprogramming;

public class Arraygcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,4,6,5,10};
		int large = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		for(int i = 0; i< nums.length;i++) {
			if(nums[i] > large) {
				 large = nums[i];
			}	
		}
		System.out.println(large);
		for(int i =0; i< nums.length;i++) {
			if(nums[i] < small) {
				small = nums[i];
			}
		}
		System.out.println(small);
		
//		int min = Math.min(large, small);
		int gcd =1;
		for (int i =1;i<= small; i++) {
			if(large%i ==0 && small%i ==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
