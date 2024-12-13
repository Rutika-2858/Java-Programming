package arrayprogramming;

import java.util.Scanner;

public class User2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int twoD = sc.nextInt();
		int oneD = sc.nextInt();
		int [] [] a = new int[twoD] [oneD];
		for(int i= 0;i< twoD;i++) {
			for(int j= 0;j< oneD; j++) {
				System.out.println("values from user:");
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i< twoD; i++) {
			for(int j=0;j< oneD; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
