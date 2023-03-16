package com.rodrigo.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.rodrigo.course.entities.Category;

public interface CategoryRepository extends JpaRepositoryImplementation<Category, Long> {

}
