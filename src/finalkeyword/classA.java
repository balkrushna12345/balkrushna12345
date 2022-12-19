package finalkeyword;

public  class classA {
int b=24353;
final int a = 345; // variable declared with final keyword

final void test() { // method declared with final keyword
	System.out.println("final keyword which used to apply restrication on class,method and variable ");
}
public void test4()
{
	System.out.println("gfcjhgjchdgj");

}

public static void main(String[] args) {
	classA ref = new classA();
	ref.test();
	System.out.println(ref.a);
	System.out.println(ref.b);
	ref.test4();
}
}