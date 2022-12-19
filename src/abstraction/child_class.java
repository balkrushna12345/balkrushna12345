package abstraction;
             //subclass         superclass
public class child_class extends parrent_class {

	public void withdraw1() {
		System.out.println("super calss completed withdraw 1");
	}

	public void test1() {
		System.out.println("super calss completed test1");
	}

	public static void main(String[] args) {
		child_class n = new child_class();
		n.withdraw();
		n.withdraw1();
		n.test1();
	}
}