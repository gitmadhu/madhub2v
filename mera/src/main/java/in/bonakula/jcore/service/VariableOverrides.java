package in.bonakula.jcore.service;

class M {
	int x = 5;
}

class N extends M {
	boolean x = false;
}

public class VariableOverrides {

	public static void main(String[] args) {
		M m= new N();
		N n = new N();
	    
		System.out.println(" x= "+m.x);
		System.out.println(" x= " + n.x);

	}

}
