package com.product.api.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.product.api.dto.ProductRequestDTO;
import com.product.api.dto.ProductResponseDTO;
import com.product.api.exception.ResourceNotFoundException;
import com.product.api.mapper.ProductMapper;
import com.product.api.model.Product;
import com.product.api.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;
	private final Cloudinary cloudinary;

	public ProductServiceImpl(ProductRepository productRepository, Cloudinary cloudinary) {
		this.productRepository = productRepository;
		this.cloudinary = cloudinary;
	}

	@Override
	public ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO, MultipartFile file) {

		try {
			Product product = new Product();

			product.setName(productRequestDTO.getName());
			product.setDescription(productRequestDTO.getDescription());
			product.setPrice(productRequestDTO.getPrice());

			Map<String, Object> uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());

			String imageUrl = uploadResult.get("secure_url").toString();
			String publicId = uploadResult.get("public_id").toString();

			product.setImageUrl(imageUrl);
			product.setPublicId(publicId);

			Product savedProduct = productRepository.save(product);

			return ProductMapper.toDTO(savedProduct);

		} catch (IOException e) {
			throw new RuntimeException("Image Upload Failed", e);
		}
	}

	@Override
	public List<ProductResponseDTO> getAllProducts() {

		return productRepository.findAll().stream().map(ProductMapper::toDTO).collect(Collectors.toList());
	}

	@Override
	public ProductResponseDTO getProductById(Long id) {

		Product product = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product Not Found With Id : " + id));

		return ProductMapper.toDTO(product);
	}

	@Override
	public ProductResponseDTO updateProduct(Long id, ProductRequestDTO productRequestDTO, MultipartFile file) {

		Product product = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product Not Found with Id : " + id));

		product.setName(productRequestDTO.getName());
		product.setDescription(productRequestDTO.getDescription());
		product.setPrice(productRequestDTO.getPrice());

		if (file != null && !file.isEmpty()) {

			try {
				cloudinary.uploader().destroy(product.getPublicId(), ObjectUtils.emptyMap());

				Map<String, Object> uploadResult = cloudinary.uploader().upload(file.getBytes(),
						ObjectUtils.emptyMap());

				String imageUrl = uploadResult.get("secure_url").toString();
				String publicId = uploadResult.get("public_id").toString();

				product.setImageUrl(imageUrl);
				product.setPublicId(publicId);

			} catch (IOException e) {
				throw new RuntimeException("Image Update Failed", e);
			}
		}

		Product updatedProduct = productRepository.save(product);

		return ProductMapper.toDTO(updatedProduct);
	}

	@Override
	public void deleteProduct(Long id) {

		Product product = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product Not Found With Id : " + id));

		try {
			cloudinary.uploader().destroy(product.getPublicId(), ObjectUtils.emptyMap());

		} catch (IOException e) {
			throw new RuntimeException("Image Delete Failed", e);
		}

		productRepository.delete(product);
	}

}