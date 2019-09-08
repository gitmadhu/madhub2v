package in.bonakula.jcore.misc;

 interface A1{
	public void method1();
}
 
 interface B1{
	 public void method1();
 }
 /*abstract class D{
	 public void method1() {
		System.out.println("in abstract class...");
	}
 }*/
class C implements A1,B1{
	public void method1() {
		System.out.println("main class.....");
	}
}
public class InterfacesMulti  {
	public static void main(String[] args) {
		C a=new C();
		a.method1();
		B1 b=new C();
		b.method1();
	}
	
}
