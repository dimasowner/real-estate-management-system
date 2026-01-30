package com.example.demo.property;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyRequest {

    @NotBlank
    private String title;

    @Size(max = 2000)
    private String description;

    @NotNull
    private PropertyType type;

    @Positive
    private BigDecimal price;

    @Positive
    private BigDecimal area;

    @NotBlank
    private String address;

    @Min(1)
    private int rooms;

    @NotNull
    private Long agentId;
}
