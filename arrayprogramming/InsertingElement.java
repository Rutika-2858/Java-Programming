package arrayprogramming;

public class InsertingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 45, 20, 21, 34};
		a = add(a, 3, 29);
		printArray(a);
		a = add(a, 0, 100);
		printArray(a);
	}
	public static void printArray(int[] a) {
		for (int i : a) {
			System.out.print( i + " ");
		}
		System.out.println();
	}
	public static int[] add(int[] a, int index, int element) {
		if (index < 0 || index > a.length) {
			System.out.println("Not possible to add");
			return a;
		}
		int[] b = new int[a.length + 1];
		b[index] = element;
		for(int i = 0; i< a.length; i++) {
			if (i < index) {
				b[i] = a[i];
			}else {
				b[i+1] = a[i];
			}
			
		}
		return b;
	}

}
