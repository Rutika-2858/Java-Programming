package stringprogramming;

import java.util.Set;
import java.util.TreeSet;

public class PangramUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The five boxing wizards jump quickly";
		s = s.toLowerCase();
		Set<Character> set = new TreeSet<>();
		for(int i = 0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				set.add(ch);
			}
		}
		if(set.size() == 26) {
			System.out.println("Pangram");
		}else {
			System.out.println("Not a pangram");
		}
	}

}
