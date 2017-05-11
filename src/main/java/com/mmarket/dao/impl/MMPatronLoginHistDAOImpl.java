/**
 * 
 */
package com.mmarket.dao.impl;

import java.sql.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mmarket.dao.CustomHibernateDaoSupport;
import com.mmarket.dao.MMPatronLoginHistDAO;
import com.mmarket.model.MMPatronLoginHistory;

/**
 * @author kevin
 *
 */
@Repository
public class MMPatronLoginHistDAOImpl extends CustomHibernateDaoSupport implements MMPatronLoginHistDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMPatronLoginHistDAO#getAllPatronsLoginHist()
	 */
	@Override
	public List<MMPatronLoginHistory> getAllPatronsLoginHist() {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMPatronLoginHistory> patrons = template.loadAll(MMPatronLoginHistory.class);
		return patrons;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMPatronLoginHistDAO#getPatronLoginHistByPatronId(long)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public MMPatronLoginHistory getPatronLoginHistByPatronId(long patronId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List patrons = template.find("from MMPatronLoginHistory where patronId=?", patronId);
		MMPatronLoginHistory patron = new MMPatronLoginHistory();
		
		if (patrons != null && patrons.size() > 0) {
			patron = (MMPatronLoginHistory)patrons.get(0);
		}
		
		return patron;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMPatronLoginHistDAO#getPatronLoginHistByHistId(long)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public MMPatronLoginHistory getPatronLoginHistByHistId(long histId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		
		List patrons = template.find("from MMPatronLoginHistory where histId = ?", histId);
		MMPatronLoginHistory patron = new MMPatronLoginHistory();
		
		if (patrons != null && patrons.size() > 0) {
			patron = (MMPatronLoginHistory)patrons.get(0);
		}
		
		return patron;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMPatronLoginHistDAO#getPatronLoginHistByDateRange(java.sql.Date, java.sql.Date)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MMPatronLoginHistory> getPatronLoginHistByDateRange(Date startDate, Date endDate) {
		DetachedCriteria criteria = DetachedCriteria.forClass(MMPatronLoginHistory.class);
		criteria.add(Restrictions.between("lastLoginDate", startDate, endDate));
		
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMPatronLoginHistory> patrons = (List<MMPatronLoginHistory>)template.findByCriteria(criteria);
		return patrons;
	}

}
