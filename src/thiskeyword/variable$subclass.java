package thiskeyword;

public class variable$subclass extends variable{
int i =4657;
int a=54;
int c=a+i;
public void method() {
	int i =758;
	System.out.println(super.i);     // superclass  varible call karnar
	System.out.println(this.i);//instance variable call karnar
	System.out.println(this.c);
	System.out.println(i);            // 
}
public static void main(String[]args) {
	variable$subclass n1= new variable$subclass();
	n1.method();
}
}
