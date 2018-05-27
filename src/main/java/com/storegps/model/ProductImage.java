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
public class ProductImage implements Serializable {

	private static final long serialVersionUID = 1L;

	private long productImageId;
	private String productImage;
	private long productId; // Foreign Key

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PRODUCT_IMAGE_ID", unique = true, nullable = false)
	public long getProductImageId() {
		return productImageId;
	}

	public void setProductImageId(long productImageId) {
		this.productImageId = productImageId;
	}

	@Column(name = "PRODUCT_IMAGE", columnDefinition = "LONGBLOB", unique = true, nullable = false)
	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	@Column(name = "PRODUCT_ID", unique = true, nullable = false)
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

}
