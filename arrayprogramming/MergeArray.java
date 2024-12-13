package arrayprogramming;
//wap to merge two array.
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a[] = {1,2,34,4};
		int b[] = {4,5,6,7,8,34,23};
		int c[] = new int[a.length + b.length];
		int index = 0;
		for(int i = 0;i < a.length;i++) {
			c[index++] = a[i];
		}
		for(int i = 0;i < b.length; i++) {
			c[index++] = b[i];
		}
		for(int i : c) {
			System.out.print(i + " ");
		}
	}

}
