//WAP to remove all the white spaces from the string.
package stringprogramming;

public class RemoveWhitespaceS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "you're welcome !";
		String res = "";
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch != ' ') {
				res += ch;
			}
		}
		System.out.println(res);
	}

}
