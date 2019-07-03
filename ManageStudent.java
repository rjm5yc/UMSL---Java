package hibernate.project.studentinfo;

import java.util.List; 
import java.util.Iterator; 

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ManageStudent {
	private static SessionFactory factory;
	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		ManageStudent MS = new ManageStudent();
		
		Integer stuID1 = MS.addStudent("Yukai", "Chen", 845014695);
		Integer stuID2 = MS.addStudent("Sarah", "Smith", 159623478);
		Integer stuID3 = MS.addStudent("Bryson", "Clark", 114552236);
		Integer stuID4 = MS.addStudent("Adam", "Barret", 123987789);
		Integer stuID5 = MS.addStudent("Kelly", "Jones", 994886543);
		
		MS.listStudents();
		
		MS.updateStudent(stuID1, 845014699);
		
		MS.deleteStudent(stuID3);
		
		MS.listStudents();
		
		public Integer addStudent(String fname, String lname, int ssn) {
			Session session = factory.openSession();
			Transaction tx = null;
			Integer studentID = null;
			
			try {
				tx = session.beginTransaction();
				Student student = new Student(fname, lname, ssn);
				studentID = (Integer) session.save(student);
				tx.commit();
			} catch (HibernateException e) {
				if (tx!=null) tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
			return studentID;
		}
		
		
		public void listStudents( ){
			Session session = factory.openSession();
			Transaction tx = null;
			
			try {
				tx = session.beginTransaction();
				List students = session.createQuery("FROM Student").list();
				for (Iterator iterator = students.iterator(); iterator.hasNext();){
					Student student = (Student) iterator.next();
					System.out.print("First Name: " + student.getFirstName());
					System.out.print("  Last Name: " + student.getLastName());
					System.out.println("  SSN: " + student.getSSN());
				}
				tx.commit();
			} catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace();
			} finally {
				session.close();
			}
		}
			
		
		
		public void updateStudent(Integer StudentID, int ssn ){
			Session session = factory.openSession();
			Transaction tx = null;
			
			try {
				tx = session.beginTransaction();
				Student student = (Student)session.get(Student.class, StudentID);
				student.setSSN( ssn );
					session.update(student);
				tx.commit();
			} catch (HibernateException e) {
				if (tx!=null) tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		}
		
		publice void deleteStudent(Integer)
	}
	
	
	
	
	
	
	
}
