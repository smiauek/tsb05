package com.test.project.HibernateJPABeginner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.controller.findUser_Hql;
import com.test.hib.model.User;

public class App {
	public static void main(String[] args) {
		findUser_Hql u = new findUser_Hql();
		u.findUser();
		
		findUser_Hql u2 = new findUser_Hql();
        u2.findUserSelect();
        
        findUser_Hql u3 = new findUser_Hql();
        u3.getRecordbyId();
        
        findUser_Hql u4 = new findUser_Hql();
        u4.getmaxSalary();

	}
}
