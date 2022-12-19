package thiskeyword;

public class $class extends superkey {

	$class() {
		this(54);

		System.out.println("child class with no argumrnt");
	}

	$class(int i) {
		super("vijay");
		System.out.println(" child class with single  parrametrer");
	}

	$class(int i, String s) {

		this();
		System.out.println(" child class with two  parrametrer");
	}

	public static void main(String[] args) {
		$class ref = new $class(3, "hgv");
		// $class ref1 = new $class(4);
		// $class ref3 = new $class();
	}

}
