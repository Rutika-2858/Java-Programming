//Given a string, the task is to toggle all the characters of the string i.e. to covert upper case to lower case and vice versa.
package stringprogramming;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		String s = "aBc12#";
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(Character.isLowerCase(ch[i]) ) {
				ch[i] = Character.toUpperCase(ch[i]);
			}else if(Character.isUpperCase(ch[i])) {
				ch[i]= Character.toLowerCase(ch[i]);
			}
		}
		String res = new String(ch);
		System.out.println(res);
		
	}

}
