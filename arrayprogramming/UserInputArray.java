package arrayprogramming;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i< a.length;i++) {
			System.out.println("Enter the element of the array");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i< a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
