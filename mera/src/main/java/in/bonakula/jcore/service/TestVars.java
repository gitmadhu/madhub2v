package in.bonakula.jcore.service;

/**
 * @Raghavender. V
 */
abstract class A {
	int i=10;
}

class B extends A implements V{
	int i = 20;
	int j=100;
}

interface V{
	int j=99;
}

public class TestVars {

	public static void main(String[] args) {
		B b = new B();
		System.out.println("sub class var : i = " + b.i);

		A a = new B();
		System.out.println("super var : i =" + a.i);
		
		V v=new B();
		
		//Testing interface variable
		System.out.println("impl class var : "+b.j);
		System.out.println("interface var : "+v.j);

	}

}
