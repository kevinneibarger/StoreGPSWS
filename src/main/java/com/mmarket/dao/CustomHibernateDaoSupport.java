package com.mmarket.dao;


/**
 * @author Kevin Neibarger
 *
 */
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

public abstract class CustomHibernateDaoSupport extends HibernateTemplate {
	@Autowired
	public void anyMethodName(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
}
