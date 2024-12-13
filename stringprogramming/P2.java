package stringprogramming;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "level";
		int i = 0;
		int j = s.length() - 1;
		boolean isPalindrome = true;
		while(i <= j) {
			if(s.charAt(i) != s.charAt(j)) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}
		if(isPalindrome) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not a Palindrome String");
		}
	}

}
