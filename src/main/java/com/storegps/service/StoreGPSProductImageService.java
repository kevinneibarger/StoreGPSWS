/**
 * 
 */
package com.storegps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.storegps.dao.impl.StoreGPSProductImageDAOImpl;
import com.storegps.model.ProductImage;

/**
 * @author kevin
 *
 */

@Service("productImageService")
public class StoreGPSProductImageService {

	@Autowired
	StoreGPSProductImageDAOImpl storeGPSProdImage;

	@Transactional
	public List<ProductImage> getAllProductImages() {
		return storeGPSProdImage.getAllProductImageInfo();
	}
}
