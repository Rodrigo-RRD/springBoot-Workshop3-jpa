package com.rodrigo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
