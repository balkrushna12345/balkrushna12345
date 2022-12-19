package polymorphism;

public class compile_time { // method overloading
	public static void test1()// method with zero argument
	{
		System.out.println("property of method1  test1");
	}

	public void test1(int a1) {// method with one argument ////superclass property

		System.out.println("property of method 2");
	}

	public void test1(int a, String s) {// method with 2 argument
		System.out.println("property of method 3");
	}
	public void test1(int a2, int a3, String s1) {//method with 3 argument
		System.out.println("property of method 4");
	}

	public static void main(String[] args) {
		compile_time n1 = new compile_time();
		n1.test1();
		n1.test1(12);
		n1.test1(3465, "amit sir");
		n1.test1(23, 3544, "method overloading");
	}
}
