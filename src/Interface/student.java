package Interface;

public class student implements student2,class_p { //implementation class
	public void test1() { // provided body to incomplete method
		System.out.println("test1 property");

	}

	public void test2() {// provided body to incomplete method
		System.out.println("constructor concept not present interface");

	}

	public void test3() {// provided body to incomplete method
		System.out.println("object not created in inerface because all abstract method");

	}

	public void test4() {// provided body to incomplete method
		System.out.println("test 4 property");
	}

	public static void main(String[] args) {
		student n1 = new student();
		n1.test1();
		n1.test2();
		n1.test3();
		n1.test4();
	}
}
