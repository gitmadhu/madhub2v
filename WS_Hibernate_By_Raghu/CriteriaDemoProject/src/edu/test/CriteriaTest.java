package edu.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import edu.mappings.Student;
import edu.util.SessionUtil;

public class CriteriaTest {
	public static void main(String[] args) {

		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
	
	// Below code is to get all the records from DB using criteria
		/*try{
			 Criteria criteria=session.createCriteria(Student.class);
			 List studentList=criteria.list();
			 System.out.println("Number Of Records :: "+studentList.size());
			 
			 Iterator iterator=studentList.iterator();
			 while(iterator.hasNext()){
				 Student student=(Student)iterator.next();
				 System.out.print("Student Name :: "+student.getStudentName()+" ; ");
				 System.out.print("Student No :: "+student.getStudentNo());
				 System.out.println();
				 
			 }
			 tx.commit();
		 }*/
		
		
// Below code is to get records based on a condition ; using criterion
		/*try{
			 //Criterion criterion=Expression.idEq("101");
			 //Criterion criterion=Expression.ne("studentNo","101");
			 
			 Criterion criterion=Expression.like("studentName","rana");
			 Criteria criteria=session.createCriteria(Student.class);
			 criteria.add(criterion);
			 
			 List studentList=criteria.list();
			 
			 // Combining all the above into one
 //List studentList=session.createCriteria(Student.class).add(Expression.idEq("101")).list();
			 
			 System.out.println("Number Of Records Fetched From DB : "+studentList.size());
			 
			 Iterator iterator=studentList.iterator();
			 while(iterator.hasNext()){
				 Student student=(Student)iterator.next();
				 System.out.print("Student Name :: "+student.getStudentName()+" ; ");
				 System.out.print("Student No :: "+student.getStudentNo());
				 System.out.println();
				 
			 }
			 tx.commit();
		 }*/
		
		/*try{
			Order order=Order.asc("studentName");
			Criteria criteria=session.createCriteria(Student.class);
			criteria.addOrder(order);
			
			List studentList=criteria.list();
			System.out.println("Number Of Records Fetched From DB : "+studentList.size());
			
			Iterator iterator=studentList.iterator();
			while(iterator.hasNext()){
				Student student=(Student)iterator.next();
				 System.out.print("Student Name :: "+student.getStudentName()+" ; ");
				 System.out.print("Student No :: "+student.getStudentNo());
				 System.out.println();
			}
		}*/
		
		
		// To Count Distinct Names using Projections
		/*try{
			Object object=session.createCriteria(Student.class)
								 .setProjection(Projections.countDistinct("studentName")).uniqueResult();
			
			System.out.println("Distinct Name Count : "+object);
			tx.commit();
		}*/
		
	   // Grouping elements using Projections	
		try{
			List groupByList=session.createCriteria(Student.class)
							  .setProjection(Projections.projectionList()
							  .add(Projections.avg("studentNo"))
							  .add(Projections.groupProperty("studentName"))).list();
			
			System.out.println("Group By List Size : "+groupByList.size());
		}
		 catch(HibernateException e){
			 System.out.println("Hibernate Exception .."+e.getClass().getName()+"--"+e.getMessage());
			 tx.rollback();
		 }
		
		
	}
}
