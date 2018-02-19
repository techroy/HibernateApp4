package com.hibernateapp4.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp4.config.HibernateConfiguration;
import com.hibernateapp4.model.AddressBean;

public class Test4 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();

		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		AddressBean aaAddressBean = (AddressBean) session.get(AddressBean.class, 1);

		aaAddressBean.setStudentBean(null);

		session.delete(aaAddressBean);

		// System.out.println("-----------");

		// System.out.println(aaAddressBean);

		// System.out.println(aaAddressBean.getStudentBean());
		tx.commit();

		session.close();

	}

}
