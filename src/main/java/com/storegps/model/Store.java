/**
 * 
 */
package com.storegps.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kevin
 *
 */
@Entity
@Table(name = "store_table")
public class Store implements Serializable {

	private static final long serialVersionUID = 1L;

	private int storeId;
	private String storeName;
	private String storeLocation;
	private String storeType;
	private String storeNum;
	private String storeHours;
	private String storePhone;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "STORE_ID", unique = true, nullable = false)
	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	@Column(name = "STORE_NAME", unique = true, nullable = false)
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	@Column(name = "STORE_LOCATION", unique = true, nullable = false)
	public String getStoreLocation() {
		return storeLocation;
	}

	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}

	@Column(name = "STORE_TYPE", unique = true, nullable = false)
	public String getStoreType() {
		return storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	@Column(name = "STORE_NUM", unique = true, nullable = false)
	public String getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(String storeNum) {
		this.storeNum = storeNum;
	}

	@Column(name = "STORE_HOURS", unique = true, nullable = false)
	public String getStoreHours() {
		return storeHours;
	}

	public void setStoreHours(String storeHours) {
		this.storeHours = storeHours;
	}

	@Column(name = "STORE_PHONE", unique = true, nullable = false)
	public String getStorePhone() {
		return storePhone;
	}

	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}

	public String toString() {

		return "Store ID: " + this.storeId + "\nStore Name: " + this.storeName + "\nStore Location: "
				+ this.storeLocation + "\nStore Type: " + this.storeType + "\nStore Number: " + this.storeNum
				+ "\nStore Hours; " + this.storeHours + "\nStore Phone: " + this.storePhone;
	}

}
