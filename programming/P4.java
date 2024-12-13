package programming;

public class P4 {

	public static void main(String[] args) {
		int a=7,b=2;
		System.out.println("before swapping");
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("after swapping");
		System.out.println("a =" +a);
		System.out.println("b =" +b);
	}

}
