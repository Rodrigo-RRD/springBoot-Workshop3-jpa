package com.rodrigo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
