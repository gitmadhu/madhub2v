package in.bonakula.test;

class Super{
	public static void method1() {
		System.out.println("super class method1...");
	}
}
class SubClass extends Super{
	public static void method1() {
		System.out.println("sub class method....");
	}
}
public class StaticMethodOverride {
	public static void main(String[] args) {
		Super super1=new Super();
		super1.method1();
	}

}
