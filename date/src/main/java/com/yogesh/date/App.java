package com.yogesh.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.accessibility.AccessibleStateSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityClass entityClass = new EntityClass();
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyy");
    	
        System.out.println( "Hello World!" );
        
        
        
        Configuration configuration = new Configuration();
        configuration.configure();
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        try {
			entityClass.setDate(simpleDateFormat.parse("12-15-2025"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Transaction transaction = session.beginTransaction();
        
        session.save(entityClass);
        transaction.commit();
        session.close();
    }
}
