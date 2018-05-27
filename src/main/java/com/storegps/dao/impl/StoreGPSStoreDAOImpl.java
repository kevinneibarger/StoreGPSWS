package com.storegps.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.storegps.dao.StoreGPSStoreDAO;
import com.storegps.model.Store;

@Repository
public class StoreGPSStoreDAOImpl implements StoreGPSStoreDAO {

	@Autowired
	public SessionFactory sessionFactory;

	@Override
	public List<Store> getAllStores() {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<Store> allData = template.loadAll(Store.class);

		System.out.println("\n -- Store Data -- \n");
		for (Store st : allData) {
			System.out.println(st.toString());
		}
		return allData;
	}

	@Override
	public Store getStoreById(long storeId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List l = template.find("from Store where storeId=?", storeId);
		Store store = new Store();

		if (l != null && l.size() > 0) {
			store = (Store) l.get(0);
		}

		return store;
	}

}
