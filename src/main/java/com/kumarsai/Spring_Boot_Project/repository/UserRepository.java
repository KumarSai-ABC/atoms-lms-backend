package com.kumarsai.Spring_Boot_Project.repository;

import com.kumarsai.Spring_Boot_Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}