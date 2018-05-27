/**
 * 
 */
package com.storegps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.storegps.dao.impl.StoreGPSStoreDAOImpl;
import com.storegps.model.Store;

/**
 * @author kevin
 *
 */

@Service("storeGPSService")
public class StoreGPSStoreService {

	@Autowired
	StoreGPSStoreDAOImpl storeGPSDAOImpl;

	@Transactional
	public List<Store> getAllStores() {
		return storeGPSDAOImpl.getAllStores();
	}

	@Transactional
	public Store getStoreById(long storeId) {
		return storeGPSDAOImpl.getStoreById(storeId);
	}

	@Transactional
	public List<Store> getStoresByType(String storeType) {
		return storeGPSDAOImpl.getStoresByType(storeType);
	}
}
