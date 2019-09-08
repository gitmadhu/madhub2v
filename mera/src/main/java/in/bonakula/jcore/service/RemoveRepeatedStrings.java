package in.bonakula.jcore.service;

import java.util.StringTokenizer;
import java.util.Vector;

public class RemoveRepeatedStrings {

	public static void main(String[] args) {

		try {
			Vector v1 = new Vector();
			Vector v2 = new Vector();
			Vector v3 = new Vector();

			String test = "raghu,ravi,mahi,raghu,mahi";

			StringTokenizer st = new StringTokenizer(test, ",");

			while (st.hasMoreElements()) {
				String tmp = st.nextToken();
				v1.add(tmp);
				v2.add(tmp);
			}
			System.out.println("v1= " + v1);
			System.out.println("v2= " + v2);
			System.out.println("*****************************************");


			for (int k = 0; k < v1.size(); k++) {
				String item = (String) v1.get(k);
				if (!v3.contains(item)) {
					v3.addElement(item);
				}
				v2 = v3;
			}
			System.out.println("v1= " + v1);
			System.out.println("v2= " + v2);
			System.out.println("#################################");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
