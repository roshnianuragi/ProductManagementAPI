package com.product.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;

import com.product.api.dto.ProductRequestDTO;
import com.product.api.dto.ProductResponseDTO;
import com.product.api.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping
	public ProductResponseDTO addProduct(@Valid ProductRequestDTO productRequestDTO, @RequestPart MultipartFile file) {

		return productService.addProduct(productRequestDTO, file);
	}

	@GetMapping
	public List<ProductResponseDTO> getAllProducts() {

		return productService.getAllProducts();
	}

	@GetMapping("/{id}")
	public ProductResponseDTO getProductById(@PathVariable Long id) {

		return productService.getProductById(id);
	}

	@PutMapping("/{id}")
	public ProductResponseDTO updateProduct(@PathVariable Long id, @Valid ProductRequestDTO productRequestDTO,
			@RequestPart(required = false) MultipartFile file) {

		return productService.updateProduct(id, productRequestDTO, file);
	}

	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Long id) {

		productService.deleteProduct(id);

		return "Product Deleted Successfully";
	}

}