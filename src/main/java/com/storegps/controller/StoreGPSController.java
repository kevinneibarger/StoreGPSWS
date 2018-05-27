/**
 * 
 */
package com.storegps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.storegps.model.Store;
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

	@RequestMapping(value = "/getAllStores", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Store> getAllPeopleViewed() {
		System.out.println("\n -- Getting all Stores! -- \n");
		return storeGPSStoreService.getAllStores();
	}

}
