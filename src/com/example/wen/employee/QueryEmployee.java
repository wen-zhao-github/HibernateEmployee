package com.example.wen.employee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.wen.employee.entity.Employee;

public class QueryEmployee {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			session.beginTransaction();
			List<Employee> employees = session.createQuery("FROM Employee").getResultList();
			for (Employee emp:employees){
				System.out.println(emp);
			}
			session.getTransaction().commit();
			
		}finally{
			factory.close();
			
		}

	}

}
