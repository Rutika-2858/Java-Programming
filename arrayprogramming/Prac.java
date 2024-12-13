package arrayprogramming;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		for(int i = 0; i< a.length;i++) {
			a[i] = sc.nextInt();
			
		}
		int sum = 0;
		for(int i = 0; i< a.length;i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
	
}
