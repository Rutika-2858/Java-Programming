//WAP to sort each row of the matrix in ascending order.
package arrayprogramming;

public class Sort2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a= {{4,2,6},{16,21,4},{9,2,1}};
		
		for(int i=0;i<a.length;i++) {
			sort(a[i]);
		}
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static void sort(int[] a) {
	for(int i= 1;i<a.length;i++) {
		int temp = a[i];
		int j = i;
		while(j>0 && a[j-1] > temp) {
			a[j]= a[j-1];
			j--;
		}
		a[j]= temp;
	}
	}
}
