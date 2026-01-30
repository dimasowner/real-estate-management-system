package com.example.demo.property.internal;

import com.example.demo.property.PropertyRequest;
import com.example.demo.property.PropertyResponse;
import com.example.demo.property.PropertyStatus;
import com.example.demo.user.internal.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PropertyService {
    private final PropertyRepository propertyRepository;
    private final UserService userService;

    public PropertyResponse create(PropertyRequest propertyRequest) {
        if (!userService.existsById(propertyRequest.getAgentId())) {
            throw new RuntimeException("Agent not found!");
        }

        Property property = Property.builder()
                .title(propertyRequest.getTitle())
                .price(propertyRequest.getPrice())
                .rooms(propertyRequest.getRooms())
                .area(propertyRequest.getArea())
                .status(PropertyStatus.AVAILABLE)
                .type(propertyRequest.getType())
                .agentId(propertyRequest.getAgentId())
                .address(propertyRequest.getAddress())
                .description(propertyRequest.getDescription())
                .build();
        Property savedProperty = propertyRepository.save(property);
        return mapToResponse(savedProperty);
    }

    private PropertyResponse mapToResponse(Property property) {
        return PropertyResponse.builder()
                .id(property.getId())
                .title(property.getTitle())
                .description(property.getDescription())
                .address(property.getAddress())
                .type(property.getType())
                .price(property.getPrice())
                .area(property.getArea())
                .rooms(property.getRooms())
                .status(property.getStatus())
                .agentId(property.getAgentId())
                .createdAt(property.getCreatedAt())
                .build();
    }
}
