package in.bonakula.jcore.generics;

class Display{
	static <T>void display(T[] arr){
		for(T i:arr){
			System.out.println(i);
		}
	}
}

public class GenericMethod {

	public static void main(String[] args) {
		Integer arr1[]={1,2,3,4};
		System.out.println("Reading Integer objects ");
		Display.display(arr1);
		
		String stringArray[]={"raghu","kiran","madhhu","pradeep"};
		System.out.println("Reading String objects");
		Display.display(stringArray);

	}

}
