package arrayprogramming;

import java.util.Scanner;

public class Sumof2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int twoD = sc.nextInt();
		int oneD = sc.nextInt();
		int [] [] a = new int[twoD] [oneD];
		int sum = 0;
		for(int i = 0; i< twoD; i++) {
			for (int j= 0; j < oneD; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i< twoD; i++) {
			for(int j=0;j< oneD; j++) {
				sum += a[i][j];
			}
		}
		System.out.println(sum);
	}

}
