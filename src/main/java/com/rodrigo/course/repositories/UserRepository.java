package com.rodrigo.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.rodrigo.course.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long> {

}
