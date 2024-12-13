package arrayprogramming;

public class LargestnumberofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {14,34,71,26,85,17};
//		int large = a[0];
		int large = Integer.MIN_VALUE;
		for(int i= 0;i<a.length;i++) {
			if(a[i]>large) {
				large = a[i];
			}
		}
		System.out.println(large);
	}

}
