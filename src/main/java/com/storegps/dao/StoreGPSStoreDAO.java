/**
 * 
 */
package com.storegps.dao;

import java.util.List;

import com.storegps.model.Store;

/**
 * @author kevin
 *
 */
public interface StoreGPSStoreDAO {

	public List<Store> getAllStores();

	public Store getStoreById(long storeId);

}
