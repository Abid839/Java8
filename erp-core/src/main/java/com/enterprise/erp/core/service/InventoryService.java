package com.enterprise.erp.core.service;

import com.enterprise.erp.domain.entity.Inventory;
import com.enterprise.erp.domain.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Autowired
    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public void checkAndReserveInventory(Long productId, Integer quantityRequired) {
        Inventory inventory = inventoryRepository.findByProductId(productId)
                .orElseThrow(() -> new RuntimeException("Inventory not found for product: " + productId));

        if (inventory.getQuantityAvailable() < quantityRequired) {
            throw new RuntimeException("Insufficient inventory for product: " + productId);
        }

        inventory.setQuantityAvailable(inventory.getQuantityAvailable() - quantityRequired);
        inventoryRepository.save(inventory);

        if (inventory.getQuantityAvailable() <= inventory.getReorderLevel()) {
            triggerReorderProcess(inventory);
        }
    }

    private void triggerReorderProcess(Inventory inventory) {
        // Complex logic to trigger reorder
        System.out.println("Triggering reorder for product: " + inventory.getProduct().getSku());
    }
}
