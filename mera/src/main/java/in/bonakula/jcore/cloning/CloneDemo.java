package in.bonakula.jcore.cloning;

class CloneDemo1 implements Cloneable{
	int a=70;
	double b=80;
	
	// This method calls Objects's clone
	CloneDemo1 cloneTest(){
		try{
			//call clone in Object
			return (CloneDemo1)super.clone();
		}
		catch(CloneNotSupportedException e){
			System.out.println("Cloning not allowed..");
			return this;
		}
	}

}

class CloneDemo{
	public static void main(String[] args) {
		CloneDemo1 x1= new CloneDemo1();
		CloneDemo1 x2;
		
		
		x2=x1.cloneTest();
		
		x1.a=10;
		x1.b=20.12;
		
		System.out.println("x1 : "+x1.a+" "+x1.b);
		System.out.println("x2 : "+x2.a+" "+x2.b);
				
	}
}
