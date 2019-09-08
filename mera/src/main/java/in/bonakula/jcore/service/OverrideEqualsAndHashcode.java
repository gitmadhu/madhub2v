package in.bonakula.jcore.service;

class Employee {
	private long empId;
	private String name;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/* Comment out the below code and check the result; 
	// Overriding the equals method which is in Object class */
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Employee))
			return false;
		Employee emp = (Employee) o;
		return emp.empId == empId && emp.name == name;
	}

	// Overriding the hashCode method which is in Object class
	public int hashCode() {
		int result = 10;
		result = result * new Integer(String.valueOf(empId)).intValue();
		return result;
	}

}

public class OverrideEqualsAndHashcode {
	/**
	 * @Raghavender. V
	 */
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("ragz");
		emp1.setEmpId(101);

		Employee emp2 = new Employee();
		emp2.setName("ragz");
		emp2.setEmpId(101);

		if (emp1.equals(emp2)) {
			System.out.println("Both Objects Are EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}

	}

}
