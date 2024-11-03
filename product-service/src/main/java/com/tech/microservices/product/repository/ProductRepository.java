package com.tech.microservices.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tech.microservices.product.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
