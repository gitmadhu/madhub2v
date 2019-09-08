package in.bonakula.test;

public class CloningTest implements Cloneable{

	/**
	 * @param args
	 */
	
	int i=10;
	int j=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	
		
		CloningTest test1=new CloningTest();
		CloningTest test2=(CloningTest)test1.clone();
		
		test1.i=60;
		test1.j=70;
		
		System.out.println(test1.i+" "+test2.j);

	}

}
