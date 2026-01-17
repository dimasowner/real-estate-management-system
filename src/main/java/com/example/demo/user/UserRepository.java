package com.example.demo.user;

import com.example.demo.user.internal.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    Optional<User> findByUsername(String username);
}
