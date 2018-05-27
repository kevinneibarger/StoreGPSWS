/**
 * 
 */
package com.storegps.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author kevin
 *
 */
public class ProductLocation implements Serializable {

	private static final long serialVersionUID = 1L;

	private long productLocationId;
	private int aisleNum;
	private String aisleGroup;
	private String aisleBayNum;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PRODUCT_LOCATION_ID", unique = true, nullable = false)
	public long getProductLocationId() {
		return productLocationId;
	}

	public void setProductLocationId(long productLocationId) {
		this.productLocationId = productLocationId;
	}

	@Column(name = "PRODUCT_AISLE_NUM", unique = true, nullable = false)
	public int getAisleNum() {
		return aisleNum;
	}

	public void setAisleNum(int aisleNum) {
		this.aisleNum = aisleNum;
	}

	@Column(name = "PRODUCT_AISLE_GROUP", unique = true, nullable = false)
	public String getAisleGroup() {
		return aisleGroup;
	}

	public void setAisleGroup(String aisleGroup) {
		this.aisleGroup = aisleGroup;
	}

	@Column(name = "PRODUCT_AISLE_BAY_NUM", unique = true, nullable = false)
	public String getAisleBayNum() {
		return aisleBayNum;
	}

	public void setAisleBayNum(String aisleBayNum) {
		this.aisleBayNum = aisleBayNum;
	}

}
