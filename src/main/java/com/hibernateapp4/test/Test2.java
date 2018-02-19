package com.hibernateapp4.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp4.config.HibernateConfiguration;
import com.hibernateapp4.model.CorporateCustomer;
import com.hibernateapp4.model.Customer;
import com.hibernateapp4.model.Laptop;
import com.hibernateapp4.model.Pen;
import com.hibernateapp4.model.Product;
import com.hibernateapp4.model.RegularCustomer;

public class Test2 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();

		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		//Product product = new Product();
		//product.setPid(1);
		//product.setProductName("Mobile");
		
		
		Pen pen = new Pen();
		pen.setColor("blue");
		pen.setPid(5);
		pen.setProductName("Parker");
		
		Laptop laptop = new Laptop();
		laptop.setPid(4);
		laptop.setProductName("Apple pro");
		laptop.setPrice("8000");
		
		//session.save(product);
		session.save(pen);
		session.save(laptop);

		tx.commit();

		session.close();
		sessionFactory.close();
	}

}
