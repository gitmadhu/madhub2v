package in.bonakula.jcore.strings;

/**
 * @author Raghavender. V
 */

public class FindStringOccurance {

	public static void main(String[] args) {
		String s1="I love bangalore I love rain love love love lovely lovelovelove";
		String searchFor="love";
		int length=searchFor.length();
		int result=0;
		
		if(length>0){
			int start=s1.indexOf(searchFor); //indexOf( ) Searches for the first occurrence of a character or substring.
			while(start!=-1){
				result++;
				start=s1.indexOf(searchFor,start+length);
			}
			System.out.println("No Of Occurances : "+result);
		}
		else{
			System.out.println("Plz give some string for search..");
		}
		
	}
}

// Note : indexing start from zero
/*
int indexOf(String str, int startIndex)
Here, startIndex specifies the index at which point the search begins. 
For indexOf( ), the search runs from startIndex to the end of the string. 
*/