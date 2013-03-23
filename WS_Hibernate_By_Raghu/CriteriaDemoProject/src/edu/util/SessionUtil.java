package edu.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class SessionUtil {
	private static final SessionFactory SESSION_FACTORY;
	static{
		try{
			SESSION_FACTORY=new Configuration()
						.configure("hibernate.cfg.xml")
						.buildSessionFactory();			
		}
		catch(HibernateException e){
			throw new ExceptionInInitializerError("Exception building Session Factory"+e.getMessage());
			
		}
	}
	public static Session getSession()throws HibernateException{
		return SESSION_FACTORY.openSession();
	}
	public static void closeSession(Session session)throws HibernateException{
		if(session!=null){
			session.close();
		}
		
	}

}
