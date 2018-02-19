package com.hibernateapp4.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp4.config.HibernateConfiguration;
import com.hibernateapp4.model.AddressBean;
import com.hibernateapp4.model.PhoneBean;
import com.hibernateapp4.model.StudentBean;

public class Test7 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();

		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		StudentBean studentBean = new StudentBean();

		studentBean.setSid(3);
		studentBean.setSname("Sam");
		studentBean.setRoll(2345);

		PhoneBean phoneBean = new PhoneBean();
		phoneBean.setPhId(3);
		phoneBean.setPhonNumber("345321");
		phoneBean.setStudentBean(studentBean);

		PhoneBean phoneBean1 = new PhoneBean();
		phoneBean1.setPhId(4);
		phoneBean1.setPhonNumber("65432");
		phoneBean1.setStudentBean(studentBean);

		
		session.save(phoneBean);
		session.save(phoneBean1);

		tx.commit();

		session.close();

		sessionFactory.close();

	}

}
