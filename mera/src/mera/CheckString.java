package mera;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {

	public static void main(String[] args) {
		
			String text = "I  and meet you will come and meet you at 123 woods h 123woods and all the woods";

			List<String> tokens = new ArrayList<String>();
			tokens.add("123 woods h 123woods");
			tokens.add("and meet you");

			String patternString = "\\b(" + String.join("|",tokens ) + ")\\b";
			System.out.println("patternString..."+patternString);
			Pattern pattern = Pattern.compile(patternString);
			Matcher matcher = pattern.matcher(text);
			//System.out.println(matcher.find());
			while (matcher.find()) {
			    System.out.println("...."+matcher.group(1));
			}
		}

}
