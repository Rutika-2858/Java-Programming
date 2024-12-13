package arrayprogramming;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] [] a = {{2,4,6,8}, {10, 20, 30}, {11,12}};
		for (int i = 0; i< a.length; i++) {
			for(int j = 0; j< a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
