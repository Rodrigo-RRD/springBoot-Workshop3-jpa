package com.rodrigo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
