package encapsulation;

public class test11 {
	private int account;
	private String NAME, location;
	private float loan;

	public void setaccount(int account) {
		this.account = account;
		
	}

	public int getaccount() {
		return account;

	}

	public void setname(String name) {
		NAME = name;
	}
void METHOD1(int a) {
	System.out.println(NAME);
}
	public void setlocation(String location) {
		this.location = location;
	}

	public String getlocation() {
		return location;
	}

	public void setloan(float loan) {
		this.loan = loan;
	}

	public float getloan() {
		return loan;
	}public static void main (String[]args) {

test11 n=new test11();
n.setaccount(356345);
n.setloan(4251365.0f);
n.setlocation("Nashik ");
n.setname("krishna");
System.out.println(n.getaccount());
System.out.println(n.getloan());
System.out.println(n.getlocation());
System.out.println(n.getClass());
n.METHOD1(243);
n.METHOD1(35);
}

}
