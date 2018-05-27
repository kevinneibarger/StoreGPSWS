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
@Table(name = "product_image")
public class ProductImage implements Serializable {

	private static final long serialVersionUID = 1L;

	private long productImageId;
	private byte[] productImage;
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
	public byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(byte[] productImage) {
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
