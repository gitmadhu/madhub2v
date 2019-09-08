package in.bonakula.jcore.misc;
/**
 * @author RAGHAVENDER. V
 */

class A {
	// Delete this method and check the output..
	public void m1() {
		System.out.println("m1 method in super class..");
	}
}

class B extends A {
	public void m1() {
		System.out.println("m1 method in subcalss..");
	}
}

public class OverriddenTest {
	public static void main(String[] args) {
		A a = new B(); 
		a.m1();
	}
}

/*
 In the above case, the overridden method should be present in super class as we are assigning
 the subclass object to super class reference.
 */
