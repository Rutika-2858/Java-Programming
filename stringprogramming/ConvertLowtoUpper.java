//WAP to convert all the lowercase characters into uppercase character.
package stringprogramming;

public class ConvertLowtoUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ThAne456*&5";
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(Character.isLowerCase(ch[i])) {
				ch[i] = (char) (ch[i] -32);
			}
		}
		String res = new String(ch);
		System.out.println(res);
	}

}
