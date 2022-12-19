package thiskeyword;

public class superkey {
	superkey(String b) {
		this(1, 1, 1, 1);
		System.out.println("superclass no parameter");
	}

	superkey(int a, int b, int c, int d) {
		this(2, 2);
		System.out.println("superclass with  single parameter");
	}

	superkey(int a, int b) {
		this(5, 2, 6);
		System.out.println("superclass with double  parameter");
	}

	superkey(int a, int b, int c) {
		System.out.println("superclass with three parameter");
	}
   public static void main(String[] args) {
   superkey ref1= new superkey("ghjsg");
}
}