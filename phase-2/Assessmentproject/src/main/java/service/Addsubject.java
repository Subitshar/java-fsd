package service;

import org.hibernate.Session;

import Util.HibernateUtil;
import model.Subject;

public class Addsubject {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Subject subject1=new Subject("T01","Tamil");
		Subject subject2=new Subject("E02","English");
		Subject subject3=new Subject("M03","Maths");
		Subject subject4=new Subject("S04","Science");
		Subject subject5=new Subject("SS05","Social");
		
		session.save(subject1);
		session.save(subject2);
		session.save(subject3);
		session.save(subject4);
		session.save(subject5);

		
		

		session.getTransaction().commit();

		session.close();
	}

}
