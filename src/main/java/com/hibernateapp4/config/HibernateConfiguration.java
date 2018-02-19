package com.hibernateapp4.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {

	public static SessionFactory getSessionFactory() {

		Configuration cfg = new Configuration();// Activates Hibernate

		cfg = cfg.configure();//

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		return sessionFactory;

	}

	public static Session getSession(SessionFactory sessionFactory) {

		return sessionFactory.openSession();
	}
}
