package abstraction;

abstract class animal { // abstract class
	public void withdraw() {// complete method
		System.out.println("superclass");
	}

	public abstract void withdraw1();// incomplete method

	public abstract void test1();// incomplete method
}// object can not create in abstract


