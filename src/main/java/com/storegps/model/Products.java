/**
 * 
 */
package com.storegps.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kevin
 *
 */
@Entity
@Table(name = "Products")
public class Products implements Serializable {

	private static final long serialVersionUID = 1L;

	private long productsId;
	private String productName;
	private String productGroup;
	private double productPrice;
	private long productLocationId; // Foreign Key
	private List<String> storeIds;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PRODUCT_ID", unique = true, nullable = false)
	public long getProductsId() {
		return productsId;
	}

	public void setProductsId(long productsId) {
		this.productsId = productsId;
	}

	@Column(name = "PRODUCT_NAME", unique = true, nullable = false)
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "PRODUCT_GROUP", unique = true, nullable = false)
	public String getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	@Column(name = "PRODUCT_PRICE", unique = true, nullable = false)
	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Column(name = "PRODUCT_LOCATION_ID", unique = true, nullable = false)
	public long getProductLocationId() {
		return productLocationId;
	}

	public void setProductLocationId(long productLocationId) {
		this.productLocationId = productLocationId;
	}

	@Column(name = "STORE_IDS", unique = true, nullable = false)
	@ElementCollection(targetClass = String.class)
	public List<String> getStoreIds() {
		return storeIds;
	}

	public void setStoreIds(List<String> storeIds) {
		this.storeIds = storeIds;
	}
}
