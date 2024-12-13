//WAP to reverse the position of the words in string without reversing the characters of the word;
package stringprogramming;

public class SplitMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java is a programming language";
		String[] str = s.split(" ");
		for(int i = str.length -1; i>= 0; i--) {
			System.out.print(str[i] + " ");
		}
	}

}
