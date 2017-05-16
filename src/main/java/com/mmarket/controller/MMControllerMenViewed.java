/**
 * 
 */
package com.mmarket.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mmarket.model.MMarketManViewTable;
import com.mmarket.service.MMarketManViewTableService;

/**
 * @author kevin
 *
 */
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class MMControllerMenViewed {

	@Autowired
	MMarketManViewTableService mmViewedService;
	
	@RequestMapping(value = "/getAllPeopleViewed", method = RequestMethod.GET, headers = "Accept=application/json") 
	public List<MMarketManViewTable> getAllPeopleViewed() {
		return mmViewedService.getAllMenViewed();
	}
	
	@RequestMapping(value = "/getManViewedById/{viewId}", method = RequestMethod.GET, headers = "Accept=application/json") 
	public MMarketManViewTable getManViewedById(@PathVariable long viewId) {
		return mmViewedService.getManViewedById(viewId);
	}
	
	@RequestMapping(value = "/getManViewedByEventId/{eventId}", method = RequestMethod.GET, headers = "Accept=application/json") 
	public List<MMarketManViewTable> getManViewedByEventId(@PathVariable long eventId) {
		return mmViewedService.getManViewedByEventId(eventId);
	}
	
	@RequestMapping(value = "/getManViewedByViewDate/{viewDate}", method = RequestMethod.GET, headers = "Accept=application/json") 
	public List<MMarketManViewTable> getManViewedByViewDate(@PathVariable Timestamp viewDate) {
		return mmViewedService.getManViewedByViewDate(viewDate);
	}
	
	@RequestMapping(value = "/getAllViewedByPatron/{patronId}", method = RequestMethod.GET, headers = "Accept=application/json") 
	public List<MMarketManViewTable> getAllPeopleViewed(@PathVariable long patronId) {
		return mmViewedService.getManViewedByPatronId(patronId);
	}
}
