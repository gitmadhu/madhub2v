package in.bonakula.jcore.Collections;

import java.util.Arrays;
import java.util.Comparator;

/*
 * @author RAGHAVENDER. V
 */

/*
We will compare objects of the Employee class using custom comparators
on the basis of employee age and name.
*/
class MphasiSEmployee{
	private int age;
	private String name;
	private long salary;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}
/*
User defined Java comparator.
To create custom java comparator, implement Comparator interface and
define compare() method.
 
The below given comparator compares employees on the basis of their age.
*/

class AgeComparator implements Comparator<MphasiSEmployee>{
	@Override
	public int compare(MphasiSEmployee emp1, MphasiSEmployee emp2) {
		int emp1Age=((MphasiSEmployee)emp1).getAge(); 
		int emp2Age=((MphasiSEmployee)emp2).getAge();
		
		if(emp1Age>emp2Age)
			return 1;
		
		if(emp1Age<emp2Age)
			return -1;
		else
		    return 0;
	}
}

/*
The below given comparator compares employees on the basis of their name.
*/

class NameComparator implements Comparator<MphasiSEmployee>{
	@Override
	public int compare(MphasiSEmployee emp1, MphasiSEmployee emp2) {
		String emp1Name=((MphasiSEmployee)emp1).getName();
		String emp2Name=((MphasiSEmployee)emp2).getName();
		
		return emp1Name.compareTo(emp2Name);
	}
}
public class ComparatorDemo {

	public static void main(String[] args) {
		
		MphasiSEmployee employee[]=new MphasiSEmployee[3];
		
		employee[0]=new MphasiSEmployee();
		employee[0].setAge(30);
		employee[0].setName("Vandana");
		employee[0].setSalary(10025);
		
		employee[1]=new MphasiSEmployee();
		employee[1].setAge(26);
		employee[1].setName("Shruthi");
		employee[1].setSalary(18026);
		
		
		employee[2]=new MphasiSEmployee();
		employee[2].setAge(32);
		employee[2].setName("Archana");
		employee[2].setSalary(480214);
		
		System.out.println("Order of employee before sorting : ");
		
		for(int i=0;i<employee.length;i++){
			System.out.println("Employee "+(i+1)+" :: Name : "+employee[i].getName()+
					" ; Age : "+employee[i].getAge()+" ; Salary : "+employee[i].getSalary());
			
		}
		System.out.println();
		
		//Sorting array on the basis of employee age by passing AgeComparator
		
		Arrays.sort(employee,new AgeComparator());
		System.out.println("Order of employee after sorting by Employee Age: ");
		for(int i=0;i<employee.length;i++){
			System.out.println("Employee "+(i+1)+" :: Name : "+employee[i].getName()+
					" ; Age : "+employee[i].getAge()+" ; Salary : "+employee[i].getSalary());
			
		}
		
		//Sorting array on the basis of employee name by passing NameComparator
		System.out.println();
		Arrays.sort(employee,new NameComparator());
		
		System.out.println("Order of employee after sorting by Employee Name: ");
		
		for(int i=0;i<employee.length;i++){
			System.out.println("Employee "+(i+1)+" :: Name : "+employee[i].getName()+
					" ; Age : "+employee[i].getAge()+" ; Salary : "+employee[i].getSalary());
			
		}		
		
	}
}

