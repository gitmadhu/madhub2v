package in.bonakula.jcore.service;
class SuperClass{
	public void test(){
		System.out.println("SuperClass.test()");
	}
}
class SubClass extends SuperClass{
	public void test(){
		System.out.println("SubClass.test()");
	}
}
public class TestOveride {

	public static void main(String[] args) {
		SuperClass a=new SubClass();
		a.test();
	}

}
