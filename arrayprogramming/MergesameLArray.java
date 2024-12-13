package arrayprogramming;

public class MergesameLArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 2, 3};
		int arr2[] = {4, 5, 6};
		int arr[] = new int[arr1.length + arr2.length];
		int index = 0;
		for(int i = 0; i< arr1.length; i++) {
			arr[index++] = arr1[i];
			arr[index++] = arr2[i];
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
