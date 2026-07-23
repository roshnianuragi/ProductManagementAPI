package com.product.api.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.product.api.dto.ProductRequestDTO;
import com.product.api.dto.ProductResponseDTO;

public interface ProductService {

	ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO, MultipartFile file);

	List<ProductResponseDTO> getAllProducts();

	ProductResponseDTO getProductById(Long id);

	ProductResponseDTO updateProduct(Long id, ProductRequestDTO productRequestDTO, MultipartFile file);

	void deleteProduct(Long id);

}
