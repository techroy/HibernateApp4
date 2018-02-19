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

public class Test8 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();

		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		StudentBean studentBean = (StudentBean) session.get(StudentBean.class, 3);

		
		
		
		Set<PhoneBean> phoneBeans = studentBean.getPhoneBeans();
		
		Iterator<PhoneBean> phIterator = phoneBeans.iterator();
		
		while(phIterator.hasNext()){
			
			PhoneBean phoneBean = phIterator.next();
			phoneBean.setStudentBean(null);
			
		}

		phoneBeans.clear();

		tx.commit();

		session.close();

		sessionFactory.close();

	}

}
