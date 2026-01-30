package com.example.demo.property;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyResponse {

    private Long id;
    private String title;
    private String description;
    private String address;
    private PropertyType type;
    private BigDecimal price;
    private BigDecimal area;
    private int rooms;
    private PropertyStatus status;
    private Long agentId;
    private LocalDateTime createdAt;
}
