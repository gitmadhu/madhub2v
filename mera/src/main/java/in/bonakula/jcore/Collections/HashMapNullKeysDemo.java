package in.bonakula.jcore.Collections;

import java.util.HashMap;
/**
 * @author RAGHAVENDER
 */
public class HashMapNullKeysDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
		hashMap.put(null, null);
		hashMap.put("",12);
		/*hashMap.put("", 54);
		hashMap.put(null, 547);*/
		
		System.out.println(hashMap.get(null));
		System.out.println(hashMap.get(""));

	}

}
