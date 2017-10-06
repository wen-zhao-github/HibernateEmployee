package com.example.wen.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.wen.employee.entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			
			session.beginTransaction();
			session.createQuery("UPDATE Employee SET company = 'ZuluTrade' WHERE id = 1").executeUpdate();
			session.getTransaction().commit();
			
		}finally{
			factory.close();
			
		}

	}

}
