package in.bonakula.jcore.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Employee implements Comparable<Employee>{
	private int empno;
	private String empName;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	// Comment the below two methods equals() and hashcode(), and then check the o/p
	@Override
	public String toString() {
		return empName;
	}
	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(empno==e.empno){
			if(empName.equalsIgnoreCase(e.empName)){
				return true;
			}
			return false;
		}
		else
			return false;
	}
	@Override
	public int hashCode() {
		return empno*10;
	}
	
	
	// Below code is to compare objects using empno.
	/*@Override
	public int compareTo(Employee o) {
		if(empno>o.empno)
		return 1;
		
		else 
			return -1;
	}*/
	
	@Override
	public int compareTo(Employee o) {
		
		return empName.compareTo(o.empName);
	}
	
}



public class SetExample {
	public static void main(String[] args) {
		Set<Employee> empSet=new HashSet<Employee>();
		
		Employee e1=new Employee();
		e1.setEmpno(101);
		e1.setEmpName("janu");
		
		Employee e2=new Employee();
		e2.setEmpno(111);
		e2.setEmpName("divya");
		
		Employee e3=new Employee();
		e3.setEmpno(109);
		e3.setEmpName("ramya");
		
		// Duplicate object will be removed using equals and hashcode 
		Employee e4=new Employee();
		e4.setEmpno(109);
		e4.setEmpName("ramya");
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		
		System.out.println("Size Of the Set :" + empSet.size());
		
		// Convert Set into List so that we can apply sort() methodon on it
		List<Employee> list=new ArrayList<Employee>(empSet);
		System.out.println("Employee list before sorting::::"+list);
		
		
		Collections.sort(list);
		System.out.println("Employee list after sorting::::"+list);
	}

}
