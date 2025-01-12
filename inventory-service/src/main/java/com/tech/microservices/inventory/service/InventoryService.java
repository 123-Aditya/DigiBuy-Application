package com.tech.microservices.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tech.microservices.inventory.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;

	public boolean isInStock(String skuCode, Integer quantity) {
		// Find an inventory for a given skuCode where quantity >= 0
		return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode ,quantity);
	}
}
