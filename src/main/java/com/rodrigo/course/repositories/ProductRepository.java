package com.rodrigo.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.rodrigo.course.entities.Product;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Long> {

}
