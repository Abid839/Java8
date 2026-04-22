package com.enterprise.erp.core.service;

import com.enterprise.erp.domain.entity.Order;
import com.enterprise.erp.domain.entity.OrderItem;
import com.enterprise.erp.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.UUID;

@Service
@Transactional
public class OrderProcessingService {

    private final OrderRepository orderRepository;
    private final InventoryService inventoryService;

    @Autowired
    public OrderProcessingService(OrderRepository orderRepository, InventoryService inventoryService) {
        this.orderRepository = orderRepository;
        this.inventoryService = inventoryService;
    }

    public Order processNewOrder(Order order) {
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setStatus(Order.OrderStatus.PENDING);

        BigDecimal totalAmount = BigDecimal.ZERO;

        for (OrderItem item : order.getItems()) {
            inventoryService.checkAndReserveInventory(item.getProduct().getId(), item.getQuantity());
            BigDecimal itemTotal = item.getUnitPrice().multiply(new BigDecimal(item.getQuantity()));
            totalAmount = totalAmount.add(itemTotal);
            item.setOrder(order);
        }

        // Apply complex tax logic
        totalAmount = calculateTaxes(totalAmount);

        order.setTotalAmount(totalAmount);
        
        return orderRepository.save(order);
    }

    private BigDecimal calculateTaxes(BigDecimal amount) {
        // Mock complex calculation
        BigDecimal taxRate = new BigDecimal("0.08"); // 8% tax
        return amount.add(amount.multiply(taxRate));
    }
}
