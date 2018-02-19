package com.hibernateapp4.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.AliasToBeanResultTransformer;

import com.hibernateapp4.config.HibernateConfiguration;
import com.hibernateapp4.model.PhoneBean;
import com.hibernateapp4.model.StudentBean;

//https://forum.hibernate.org/viewtopic.php?f=1&t=962655
public class Test10 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();

		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		Criteria criteria = session.createCriteria(PhoneBean.class, "phone");
		criteria.createCriteria("phone.studentBean", "student");

		Projection p1 = Projections.property("phone.phonNumber");
		Projection p2 = Projections.property("student.sname");

		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(p1);
		projectionList.add(p2);

		criteria.setProjection(projectionList);

		List<Object> listObject = criteria.list();

		for (Object ob : listObject) {

			Object[] obj = (Object[]) ob;

			System.out.println(obj[0] + "---" + obj[1]);

		}

		tx.commit();

		session.close();

		sessionFactory.close();

	}

}
