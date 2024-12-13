package arrayprogramming;

import java.util.Scanner;

public class TransposeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt(); // size of 2d array or rows
		int cols = sc.nextInt(); // size of 1d array or cols
		int [][] a = new int[rows][cols];
		for(int i= 0; i<a.length;i++) {
			for(int j= 0;j<a[i].length;j++) {
				a[i][j] = sc.nextInt();
						
			}
		}
		int[][] b = new int [cols][rows];
		for(int i= 0;i<a.length;i++) {
			for(int j= 0;j<a[i].length;j++) {
				b[j][i]= a[i][j];
			}
		}
		for(int i= 0;i<b.length;i++) {
			for(int j= 0;j<b[i].length;j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
