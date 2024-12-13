//WAP to find percentage of each type of character present in the string.
package stringprogramming;

public class FindPercentageofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Aa#1";
		float upper = 0.0f, lower = 0.0f, digit = 0.0f, special= 0.0f;
		for(int i = 0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)) {
				lower++;
			}else if (Character.isUpperCase(ch)) {
				upper++;
			}else if (Character.isDigit(ch)) {
				digit++;
			}else  {
				special++;
			}
		}
		System.out.println("UC =" + upper/s.length()*100);
		System.out.println("LC =" + lower/s.length()*100);
		System.out.println("Digit =" + digit/s.length()*100);
		System.out.println("Special =" + special/s.length()*100);
		
	}
	

}
