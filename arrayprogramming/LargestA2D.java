package arrayprogramming;

import java.util.Scanner;

public class LargestA2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int twoD = sc.nextInt();
		int oneD = sc.nextInt();
		int [][] a = new int[twoD][oneD];
		for(int i= 0;i< a.length;i++) {
			for(int j= 0;j<a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
//		int large = Integer.MIN_VALUE;
		for(int i= 0;i<a.length;i++) {
			int large = Integer.MIN_VALUE;
			for(int j= 0;j<a[i].length;j++) {
				if((a[i][j])> large) {
					large = a[i][j];
				}
			}
			System.out.println(large);
		}

	}

}
