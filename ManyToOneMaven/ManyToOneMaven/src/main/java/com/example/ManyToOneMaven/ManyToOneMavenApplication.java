package com.example.ManyToOneMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.DepartmentEntity;
import entity.TeacherEntity;

public class ManyToOneMavenApplication {

	public static void main(String[] args) {}
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		DepartmentEntity dep = new DepartmentEntity();
		dep.setDeptName("IT");
		
		DepartmentEntity dep2 = new DepartmentEntity();
		dep2.setDeptName("HR");
		
		TeacherEntity t1 = new TeacherEntity();
		t1.setDepartment(dep);
		t1.setSalary("1000");
		t1.setTeacherName("MHaseeb");
		
		TeacherEntity t2 = new TeacherEntity();
		t2.setDepartment(dep);
		t2.setSalary("2220");
		t2.setTeacherName("Shahparan");
		
		TeacherEntity t3 = new TeacherEntity();
		t3.setDepartment(dep);
		t3.setSalary("30000");
		t3.setTeacherName("James");
		
		TeacherEntity t4 = new TeacherEntity();
		t4.setDepartment(dep2);
		t4.setSalary("40000");
		t4.setTeacherName("Joseph");
		session.save(dep);
		session.save(dep2);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		t.commit();
		
	}
		
		
	}
		


​

​

​

​
