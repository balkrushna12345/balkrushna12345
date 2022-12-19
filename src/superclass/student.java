package superclass;

import abstraction.parrent_class;

public class student extends parrent_class {     // concrete class(subclass)

	public void withdraw1() {                  // provided implementation to incomplete method
		System.out.println("super calss completed withdraw 1");
	}

	public void test1()          // provided implementation to incomplete method
	{
		System.out.println("super calss completed test1");
	}

	public static void main(String[] args) {
		student n = new student();
		n.withdraw();                // calling complete method
		n.withdraw1();               // calling incomplete method
		n.test1();                   // calling incomplete method
	}
}
