//WAP to check if the string is a pangram string or not.
//WAP to find out the minimum number of characters required to make the string pangram.
package stringprogramming;

public class PangramUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The five boxing wizards jump quickly";
		s = s.toLowerCase();
		boolean[] b = new boolean [26];
		for(int i = 0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				b[ch - 'a'] = true;
			}
		}
		int count = 0;
		for(int i = 0; i<b.length;i++) {
			if(b[i]) {
				count++;
			}
		}
		if(count == 26) {
			System.out.println("Pangram");
		}else {
			System.out.println("Not a pangram");
		}
	}

}
