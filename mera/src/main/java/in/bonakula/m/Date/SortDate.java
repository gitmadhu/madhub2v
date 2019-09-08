package in.bonakula.m.Date;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
/**
 * 
 * @author Madhu
 *
 */
public class SortDate {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d1 = "1/02/2013";
		String d2 = "1/05/2012";
		String d3 = "1/02/2011";
		String d4 = "1/09/2011";

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Date date1 = sdf.parse(d1, new ParsePosition(0));
		Date date2 = sdf.parse(d2, new ParsePosition(0));
		Date date3 = sdf.parse(d3, new ParsePosition(0));
		Date date4 = sdf.parse(d4, new ParsePosition(0));

		Calendar cal = Calendar.getInstance();
		List dateList = new ArrayList();
		dateList.add(cal.getTime());
		dateList.add(date1);
		dateList.add("No date1");
		dateList.add(date2);
		dateList.add(date3);
		dateList.add("No date2");
		dateList.add(null);
		dateList.add(date4);
		dateList.add("No date3");
		System.out.println("Origianal List: " + dateList);
		Collections.sort(dateList, new DateComparator());
		System.out.println("Ordered List: " + dateList);
	}
}

class DateComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Date d1 = null;
		Date d2 = null;

		int order = 1; // 1: ascending order; -1:descending order

		// ascending order priority : null-String-Dates(older to new)
		// Descending order priority : Dates(new to older)-String-null
		if ((o1 == null && o2 == null)) {
			return 0;
		} else if (o1 == null)
			return -order;
		else if (o2 == null)
			return order;

		if (o1.equals(o2)) {
			return 0;
		}

		try {
			d1 = (Date) o1;
		} catch (Exception e) {
			return -order;
		}

		try {
			d2 = (Date) o2;

		} catch (Exception e) {
			return order;
		}

		return (order) * d1.compareTo(d2);
	}

}
