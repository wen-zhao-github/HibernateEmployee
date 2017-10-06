package com.example.wen.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.wen.employee.entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			
			session.beginTransaction();
			session.createQuery("DELETE FROM Employee WHERE id = 4").executeUpdate();
			session.getTransaction().commit();
			
		}finally{
			factory.close();
			
		}

	}

}
