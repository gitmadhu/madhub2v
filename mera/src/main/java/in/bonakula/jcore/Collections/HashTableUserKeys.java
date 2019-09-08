package in.bonakula.jcore.Collections;

import java.util.Hashtable;

public class HashTableUserKeys {

	public static void main(String[] args) {
		
		Hashtable<Mployee, String> ht=new Hashtable<Mployee, String>();
		
		ht.put(new Mployee(101, "Ram", 2365),   "RAM");
		ht.put(new Mployee(256, "Arun", 4589),  "ARUN");
		ht.put(new Mployee(568, "Kiran", 7514), "KIRAN");
		ht.put(new Mployee(698, "Malli", 2569), "MALLI");
		ht.put(new Mployee(259, "Hanu", 9874),  "HANU");
		
		System.out.println("Fetching value by creating new key :");
		Mployee e=new Mployee(101, "Ram", 2365);
		
		System.out.println(e+"==>"+ht.get(e));

	}

}

class Mployee{
	private String name;
	private int salary;
	private int id;
	
	Mployee(int id, String name, int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Id: "+this.id+" -- Name: "+this.name+" -- Salary: "+this.salary;
	}
	
	@Override
    public int hashCode() {
        System.out.println("In hashcode");
        return this.getId();
    }
     
    @Override
    public boolean equals(Object obj) {
        Mployee e = null;
        if(obj instanceof Mployee){
            e = (Mployee) obj;
        }
        System.out.println("In equals");
        if(this.getId() == e.getId()){
            return true;
        } else {
            return false;
        }
         
    }
}
