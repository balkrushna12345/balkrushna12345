package abstraction;


	public class dog extends animal{

		public void withdraw1() {
			System.out.println(" completed withdraw 1");
		}

		public void test1() {
			System.out.println(" completed test1");
		}

		public static void main(String[] args) {
		
		animal ref= new dog();
	    ref.withdraw();
	    ref.withdraw1();
	    ref.test1();
	}
		}

