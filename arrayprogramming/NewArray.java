package arrayprogramming;

public class NewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int [] a = {9,6,7,5,4,1,2,3,0};
		int total = n* (n+1)/2;
		int sumofArray = 0;
		for (int i : a) {
			sumofArray += i;
		}
		System.out.println(total - sumofArray);
	}

}
