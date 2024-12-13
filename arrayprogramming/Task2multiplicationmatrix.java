package arrayprogramming;

public class Task2multiplicationmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] b = {{1,2,3},{1,0,1},{0,0,0}};
		int rows = a.length;
		int cols = a[0].length;
		int[][] c = new int[rows][cols];
		for(int i= 0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				c[i][j]= a[i][j] * b[i][j];
			}
		}
		for(int i= 0; i<a.length;i++) {
			for(int j= 0;j<a[i].length;j++) {
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();		
			}
//		for (int i= 0; i<a.length;i++) {
//			for(int j=0; j<a[i].length;j++) {
//				
//			}
//		}
	}

}
