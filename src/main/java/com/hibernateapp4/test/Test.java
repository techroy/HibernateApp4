package com.hibernateapp4.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp4.config.HibernateConfiguration;
import com.hibernateapp4.model.CorporateCustomer;
import com.hibernateapp4.model.Customer;
import com.hibernateapp4.model.RegularCustomer;

public class Test {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();

		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("max");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setName("john");
		corporateCustomer.setOrganizationName("ABCCOmp");
		corporateCustomer.setSalary("50000");

		RegularCustomer regularCustomer = new RegularCustomer();

		regularCustomer.setId(3);
		regularCustomer.setName("Sam");
		regularCustomer.setAddress("bgl");

		session.save(customer);
		session.save(corporateCustomer);
		session.save(regularCustomer);

		tx.commit();

		session.close();
		sessionFactory.close();
	}

}
