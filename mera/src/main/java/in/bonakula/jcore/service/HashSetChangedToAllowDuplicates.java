package in.bonakula.jcore.service;

import java.util.HashSet;
import java.util.Iterator;

class Source{
	private String name;

	public Source(String nm){
		this.name=nm;
	}
	public String getName() {
		return name;
	}
	
	public boolean equals(Object obj){
		if(this==obj) return true;
		if(!(obj instanceof Source)) return false;
		Source obj1=(Source)obj;
		return ((obj1.name).equalsIgnoreCase(this.name));
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
}
public class HashSetChangedToAllowDuplicates {
	public static void main(String[] args) {
		HashSet<Source> set=new HashSet<Source>();
		Source s1=new Source("raghu");
		Source s2=new Source("ravi");
		Source s3=new Source("raghu");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println("Set contains "+set.contains(new Source("raghu")));
		
		Iterator itr=set.iterator();
		Source s;
		Integer i;
		
		while(itr.hasNext()){
			s=(Source)itr.next();
			System.out.println(s.getName());
		}
		
	}
}
