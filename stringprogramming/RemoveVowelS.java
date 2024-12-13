//WAP to remove all the vowels from the string.
package stringprogramming;

public class RemoveVowelS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "icecream";
		String res = "";
		for(int i = 0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U') {
				res += ch;
				}
			}
		System.out.println(res);
		}

}
