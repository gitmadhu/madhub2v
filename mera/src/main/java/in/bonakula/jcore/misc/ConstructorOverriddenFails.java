package in.bonakula.jcore.misc;
/**
 * @author RAGHAVENDER. V
 */
class P{
	// Comment the below default constructor and check
	P(){
		System.out.println("super class default constructor..");
	}
	
	P(int i){
		System.out.println("Super class param Constructor.."+i);
	}
}
class Q extends P{
	Q(){
		System.out.println("Subclass default constructor..");
	}
	
	Q(String s){
		System.out.println("Subclass param Constructor.."+s);
		
	}
}
public class ConstructorOverriddenFails {
	
	public static void main(String[] args) {
		
		Q q1=new Q();
		Q q=new Q("ragz..");
		//P p=new P(99);
	}

}
