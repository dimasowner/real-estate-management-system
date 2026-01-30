package com.example.demo.property.internal;

import com.example.demo.property.internal.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface PropertyRepository extends JpaRepository<Property, Long> {
    List<Property> findAllByAgentId(Long id);
}
