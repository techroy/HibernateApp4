package com.hibernateapp4.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp4.config.HibernateConfiguration;
import com.hibernateapp4.model.AddressBean;
import com.hibernateapp4.model.GroupBean;
import com.hibernateapp4.model.PhoneBean;
import com.hibernateapp4.model.StudentBean;
import com.hibernateapp4.model.UserBean;
import com.hibernateapp4.model.UserGroupBean;

public class Test9 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();

		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		/*UserBean userBean = new UserBean();
		userBean.setUid(1);
		userBean.setUname("max");

		GroupBean groupBean = new GroupBean();
		groupBean.setGid(1);
		groupBean.setGname("silver");

		UserGroupBean userGroupBean = new UserGroupBean();
		userGroupBean.setUserBean(userBean);
		userGroupBean.setGroupBean(groupBean);
		userGroupBean.setUserGroupId(1);
		userGroupBean.setStatus("activated");*/
		
		UserBean userBean = new UserBean();

		userBean.setUid(3);
		userBean.setUname("Adam");

		GroupBean groupBean = new GroupBean();

		groupBean.setGid(3);
		groupBean.setGname("Regular");

		UserGroupBean userGroupBean = new UserGroupBean();

		userGroupBean.setUserGroupId(3);

		userGroupBean.setUserBean(userBean);
		userGroupBean.setStatus("Activated");
		
		userGroupBean.setGroupBean(groupBean);


		session.save(userGroupBean);

		tx.commit();

		session.close();

		sessionFactory.close();

	}

}
