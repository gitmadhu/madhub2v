package in.bonakula.jcore.service;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetUse {

	static NavigableSet<String> citiesSet;
	public static void main(String[] args) {
		
		String[] cities={"A","B","C","D","E","F"};
		citiesSet=new TreeSet<String>();
		for(String city:cities){
			citiesSet.add(city);
		}
		for(String city: citiesSet){
			System.out.println(" "+city);
		}
	}

}
