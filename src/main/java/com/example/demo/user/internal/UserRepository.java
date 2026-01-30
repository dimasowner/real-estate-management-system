package com.example.demo.user.internal;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface UserRepository extends JpaRepository<User, Long> {

    boolean existsById(@NotNull Long id);

    boolean existsByEmail(String email);

    Optional<User> findByUsername(String username);
}
