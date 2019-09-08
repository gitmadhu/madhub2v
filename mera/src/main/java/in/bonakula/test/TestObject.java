package in.bonakula.test;

public class TestObject {
	
	TestObject(){
		new TestObject();  // java.lang.StackOverflowError
	}

	public static void main(String[] args) {

		TestObject t=new TestObject();
	}
}
