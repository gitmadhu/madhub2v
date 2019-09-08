package in.bonakula.jcore.service;

public class InterfacesForPrimitiveType {

	public static void main(String[] args) throws Exception{
		Class clazz=int.class;
		Class[] interfaces=clazz.getInterfaces();
				
		System.out.println(interfaces+" "+clazz);

	}

}
