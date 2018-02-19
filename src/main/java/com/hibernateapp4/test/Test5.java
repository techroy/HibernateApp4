package com.hibernateapp4.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp4.config.HibernateConfiguration;
import com.hibernateapp4.model.AddressBean;
import com.hibernateapp4.model.PhoneBean;
import com.hibernateapp4.model.StudentBean;

public class Test5 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();

		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		StudentBean studentBean = new StudentBean();
		
		studentBean.setSid(2);
		studentBean.setSname("iain");
		studentBean.setRoll(1234);
		
		
		PhoneBean phoneBean = new PhoneBean();
		phoneBean.setPhId(1);
		phoneBean.setPhonNumber("12345");
		
		PhoneBean phoneBean1 = new PhoneBean();
		phoneBean1.setPhId(2);
		phoneBean1.setPhonNumber("34567");
		
		Set<PhoneBean> phoneBeans = new HashSet<PhoneBean>();
		phoneBeans.add(phoneBean);
		phoneBeans.add(phoneBean1);
		
		
		studentBean.setPhoneBeans(phoneBeans);
		
		session.save(studentBean);
		
		tx.commit();

		session.close();
		
		sessionFactory.close();

	}

}
