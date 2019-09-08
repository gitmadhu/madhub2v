package in.bonakula.jcore.misc;
/*   We can declare a constructor inside Abstract class... 
 * 
 */

abstract class TestSuper {
  public TestSuper(){
	  System.out.println("Super Constructor in abstract class....TestSuper.....");
  }
  public TestSuper(int x){
	  System.out.println("inside super class parameterised constructor...");
  }
}

class TestSub extends TestSuper{
	public TestSub(){
		//super(5);
		System.out.println("Subclass Constructor...TestSub....");
	}
	public void printSub() {
		System.out.println("in subclass method...");
	}
}

public class TestMain {
	public static void main(String[] args) {
		TestSub testSub=new TestSub();
		testSub.printSub();
	}
}
