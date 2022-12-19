package finalkeyword;

public class classB extends classA {
	int b = 654;
	
	public void test0() { // method declared with final keyword
		System.out.println(" restrication on class,method and variable ");
	}

	public static void main(String[] args) {
		classB ref1 = new classB();
		ref1.test0();
		ref1.test();

		System.out.println(ref1.a);
		System.out.println(ref1.b);
		ref1.test4();
	}
}