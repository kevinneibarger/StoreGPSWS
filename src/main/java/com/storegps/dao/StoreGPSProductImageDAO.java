package com.storegps.dao;

import java.util.List;

import com.storegps.model.ProductImage;

public interface StoreGPSProductImageDAO {

	public List<ProductImage> getAllProductImageInfo();

	public ProductImage getProductImageInfoById(long productId);
}
