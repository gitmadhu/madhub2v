package in.bonakula.jcore.generics;
/**
 * @author Raghavender. V
 */

class MyClass<T>{
	T obj;	//declares T type object
	
	MyClass(T obj){
		this.obj=obj;
	}
	
	// a method which returns T type object
	T getObj(){
		return obj;
	}
}
public class GenericsDemo {

	public static void main(String[] args) {
		// create Integer class object
		Integer i=99;
		MyClass<Integer> obj=new MyClass<Integer>(i);
		System.out.println("You stored : "+obj.getObj());
		
		//create Float class Object
		Float f=99.99f;
		MyClass<Float> obj1=new MyClass<Float>(f);
		System.out.println("You stored : "+obj1.getObj());
		
		String s="raghu";
		MyClass<String> obj2=new MyClass<String>(s);
		System.out.println("You stored : "+obj2.getObj());
	}

}
