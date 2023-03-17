package com.rodrigo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
