package com.rodrigo.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.rodrigo.course.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long> {

}
