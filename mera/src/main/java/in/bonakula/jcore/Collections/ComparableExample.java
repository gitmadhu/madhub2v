package in.bonakula.jcore.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author RAGHAVENDER
 */

class Student implements Comparable{
	int rollNo;
	String name;
	int age;
	
	Student(int rollNo, String name, int age) {
	  this.rollNo=rollNo;
	  this.name=name;
	  this.age=age;
	}
	
	@Override
	public int compareTo(Object o) {
		Student student=(Student)o;
		if(age==student.age)
			return 0;
		else 
			if(age>student.age)
			return 1;
		else 
			return -1;
	}
	
}

public class ComparableExample {

	public static void main(String[] args) {
		ArrayList<Student> studentList=new ArrayList<Student>();
		
		studentList.add(new Student(101,"Raghu",28));
		studentList.add(new Student(125,"Nani",17));
		studentList.add(new Student(116,"Charan",32));
		
		Collections.sort(studentList);
		
		Iterator<Student> iterator=studentList.iterator();
		
		while(iterator.hasNext()){
		Student student=iterator.next();
		System.out.println(student.rollNo+" "+student.name+" "+student.age);
		}
		
	}

}
