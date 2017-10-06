package com.example.wen.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.wen.employee.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			Employee employee = new Employee("Sally","F","Pactera");
			System.out.println("new Employee info: "+employee);
			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();
			
		}finally{
			factory.close();
			
		}

	}

}
