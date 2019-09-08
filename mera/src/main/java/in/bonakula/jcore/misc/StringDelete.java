package in.bonakula.jcore.misc;
/**
 * Delete charactor from string
 * @author Madhu
 *
 */
public class StringDelete {

	public static void main(String[] args) {
		String s = "123145156167189";
		
		char[] a = s.toCharArray();
		char[] b=new char[a.length];  // Output Array...
		
		for(int i=0,j=0; i< a.length; i++){
			
			if (a[i] != '1'){
				b[j] = a[i];
				j++;
			}
			
		}
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
