package polymorphism;
            //subclass          superclass
public class overriding extends compile_time {
	public  void test1()// method with zero argument
	{
		System.out.println("subclass property of method  test1");
	}

	public void test1(int a1) { // subclass property

		System.out.println("subclass property of method 2");
	}

	public void test1(int a, String s) {// method with 2 argument
		System.out.println(" subclass property of method 3");
	}

	public void test1(int a2, int a3, String s1) {// method with 3 argument
		System.out.println("subclass property of method 4");
	}

	public static void main(String[] args) {
		overriding n1 = new overriding();
		n1.test1();
		n1.test1(45);
		n1.test1(124, "amit sir");
		n1.test1(243, "automation");
	}
}
