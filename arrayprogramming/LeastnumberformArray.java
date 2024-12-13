package arrayprogramming;
//wap to find smallest element in the array.
public class LeastnumberformArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {14,34,71,26,85,17};
//		int small = a[0];
		int small = Integer.MAX_VALUE;
		for(int i= 0;i<a.length;i++) {
			if(a[i]<small) {
				small = a[i];
			}
		}
		System.out.println(small);
	}

}
