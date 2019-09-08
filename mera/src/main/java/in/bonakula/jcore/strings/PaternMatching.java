package in.bonakula.jcore.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaternMatching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Pattern p = Pattern.compile("cat | dog");
		 Matcher m = p.matcher("one catcat two cats in the yard, cats are dogs");
		 StringBuffer sb = new StringBuffer();
		 while (m.find()) {
			 System.out.println(m.groupCount());
		     m.appendReplacement(sb, "dog");
		 }
		 m.appendTail(sb);
		 System.out.println(sb.toString());

	}

}
