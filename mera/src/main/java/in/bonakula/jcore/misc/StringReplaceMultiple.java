package in.bonakula.jcore.misc;

//Replace 1 with 'a', 2 with 'b' and 3 with 'c'

public class StringReplaceMultiple {

	public static void main(String[] args) {
		String s = "1231451526136718293";   //  NaNbNc a=1 b=2 c=3
		
		char[] a = s.toCharArray();
		char b[]=new char[a.length];       // output array
		
		for(int i=0; i< a.length; i++){
			if(a[i] == '1'){
				b[i] = 'a';
			}
			else if(a[i] == '2'){
				b[i] = 'b';
			}
			else if(a[i] == '3'){
				b[i] = 'c';
			}
			else{
				b[i] = a[i];
			}
		}
		
		System.out.println(a);
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println(b);
		
		//System.out.println(s.replace("1","a" ));
	}
}
