package Interface;

public interface class_p {
	void test1(); // method inside interface are already public and abstract

	public void test2(); // incomplete method

	abstract void test3(); // incomplete method

	public abstract void test4();// incomplete method

	public static void main(String[] args) {
		class_p n = new stu3();
		n.test1();
		n.test2();
		n.test3();
		n.test4();
	}
}
