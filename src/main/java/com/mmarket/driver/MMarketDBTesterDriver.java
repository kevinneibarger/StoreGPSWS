/**
 * 
 */
package com.mmarket.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mmarket.model.MMarketManViewTable;
import com.mmarket.service.MMarketManViewTableService;

/**
 * @author kevin
 *
 */
public class MMarketDBTesterDriver {

	@Autowired
	private static MMarketManViewTableService service;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ApplicationContext ctx = new FileSystemXmlApplicationContext(System.getProperty("user.dir") + "//src//main//webapp//WEB-INF//spring-servlet.xml");
//		MMarketManViewTable bean = (MMarketManViewTable)ctx.getBean(MMarketManViewTable.class);
//		
//		List<MMarketManViewTable> viewed = service.getAllMenViewed();
//		
//		for (MMarketManViewTable m : viewed) {
//			System.out.println("Event Id: "+m.getEventId());
//		}
	}

}
