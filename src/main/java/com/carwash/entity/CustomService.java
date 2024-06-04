package com.carwash.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "custom_service")
public class CustomService {
    private String id;
    private String serviceName;
    private List<CarWashService> services;
}
