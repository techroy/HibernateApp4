package com.hibernateapp4.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp4.config.HibernateConfiguration;
import com.hibernateapp4.model.AddressBean;
import com.hibernateapp4.model.StudentBean;

public class Test3 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();

		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		StudentBean studentBean = new StudentBean();
		studentBean.setRoll(12);
		studentBean.setSid(1);
		studentBean.setSname("max");

		AddressBean addressBean = new AddressBean();
		addressBean.setAddrId(1);
		addressBean.setStreetNo("123abc");
		addressBean.setCity("bgl");
		addressBean.setStudentBean(studentBean);

		// session.save(studentBean);
		session.save(addressBean);

		tx.commit();

		session.close();
		sessionFactory.close();

	}

}
