package in.bonakula.jcore.designPatterns;

/**
 * @author Raghavender. V
 */
class SingletonClass{
	private static SingletonClass singletonObject;
	
	private SingletonClass(){
		
	}
	
	// Create a method for getting the reference to the Singleton Object
	// Make the access method Synchronized to prevent Thread Problems.
	public static synchronized SingletonClass getSingletonObject(){
		if(singletonObject==null){
			singletonObject=new SingletonClass();
		}
		return singletonObject;
	}
	
	// Override the Object's clone method to prevent cloning
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
} // SingletonClass

public class SingletonDesignPattern {

	public static void main(String[] args) {
		SingletonClass obj1=SingletonClass.getSingletonObject();
		SingletonClass obj2=SingletonClass.getSingletonObject();
		
		System.out.println("Singleton object obtained..");
		System.out.println("Verify the hash code for both objects, it will be same...");
		System.out.println("Object1 hash code :  "+ obj1.hashCode());
		System.out.println("Object2 hash code :  "+ obj2.hashCode());
		
		//SingletonClass sc= new SingletonClass(); --> leads to compile time error 

	}

}
