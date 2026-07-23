package com.product.api.mapper;

import com.product.api.dto.ProductResponseDTO;
import com.product.api.model.Product;

public class ProductMapper {

	public static ProductResponseDTO toDTO(Product product) {

		ProductResponseDTO dto = new ProductResponseDTO();

		dto.setId(product.getId());
		dto.setName(product.getName());
		dto.setDescription(product.getDescription());
		dto.setPrice(product.getPrice());
		dto.setImageUrl(product.getImageUrl());

		return dto;
	}

}