package in.bonakula.jcore.misc;

class MyTest{
	public MyTest(){
		System.out.println("MyTest Constructor..");
	}
	
	static{
		System.out.println("Static block in MyTest class..");
	}
}

public class ClassDotFornameDemo {
	public static void main(String[] args) {
		
		try{
			System.out.println("The First Time calls forName()");
			Class c=Class.forName("MyTest");
			
			MyTest test=(MyTest)c.newInstance();
			
			System.out.println("The Second Time calls forName()");
			Class c1=Class.forName("MyTest");
		}
		catch (ClassCastException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
