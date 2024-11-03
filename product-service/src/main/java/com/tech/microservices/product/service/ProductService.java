package com.tech.microservices.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.microservices.product.dto.ProductRequest;
import com.tech.microservices.product.dto.ProductResponse;
import com.tech.microservices.product.model.Product;
import com.tech.microservices.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public ProductResponse createProduct(ProductRequest productRequest) {
		Product product = Product.builder()
				.name(productRequest.name())
				.description(productRequest.description())
				.price(productRequest.price())
				.build();
		productRepository.save(product);
		System.out.println("Product crated successfully!");
		// log.info("Product created successfully!");
		
		return new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice());
	}

	public List<ProductResponse> getAllProducts() {
		return productRepository.findAll()
				.stream()
				.map(product -> new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice()))
				.toList();
	}
}
