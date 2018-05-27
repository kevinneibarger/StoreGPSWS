/**
 * 
 */
package com.storegps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.storegps.model.ProductImage;
import com.storegps.model.Store;
import com.storegps.service.StoreGPSProductImageService;
import com.storegps.service.StoreGPSStoreService;

/**
 * @author kevin
 *
 */

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class StoreGPSController {

	@Autowired
	StoreGPSStoreService storeGPSStoreService;

	@Autowired
	StoreGPSProductImageService productImageService;

	@RequestMapping(value = "/getAllStores", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Store> getAllStores() {
		System.out.println("\n -- Getting all Stores! -- \n");
		return storeGPSStoreService.getAllStores();
	}

	@RequestMapping(value = "/getStoreById/{storeId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Store getStoreById(@PathVariable long storeId) {
		System.out.println("\n -- Getting Store By ID: " + storeId + " -- \n");
		return storeGPSStoreService.getStoreById(storeId);
	}

	@RequestMapping(value = "/getStoreByType/{storeType}", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Store> getAllPeopleViewed(@PathVariable String storeType) {
		System.out.println("\n -- Getting Stores By Type: " + storeType + " -- \n");
		return storeGPSStoreService.getStoresByType(storeType);
	}

	@RequestMapping(value = "/getAllProductImageInfo", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<ProductImage> getAllProdImageInfo() {
		System.out.println("\n -- Getting all ProductImage Info! -- \n");
		return productImageService.getAllProductImages();
	}

}
