package Interface;

final class final_keyword { // class declared with final keyword
	final int a = 345; // variable declared with final keyword

	final void test() { // method declared with final keyword
		System.out.println("final keyword which used to apply restrication on class,method and variable ");
	}

	public static void main(String[] args) {
		final_keyword ref = new final_keyword();
		ref.test();
		System.out.println(ref.a);
	}
}
