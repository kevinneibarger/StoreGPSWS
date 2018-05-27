package com.storegps.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.storegps.dao.StoreGPSProductImageDAO;
import com.storegps.model.ProductImage;

@Repository
public class StoreGPSProductImageDAOImpl implements StoreGPSProductImageDAO {

	@Autowired
	public SessionFactory sessionFactory;

	@Override
	public List<ProductImage> getAllProductImageInfo() {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<ProductImage> allData = template.loadAll(ProductImage.class);

		return allData;
	}

	@Override
	public ProductImage getProductImageInfoById(long productId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List l = template.find("from ProductImage where productId=?", productId);
		ProductImage pi = new ProductImage();

		if (l != null && l.size() > 0) {
			pi = (ProductImage) l.get(0);
		}

		return pi;

	}

}
