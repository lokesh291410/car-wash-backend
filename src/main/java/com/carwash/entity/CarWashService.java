package com.carwash.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "car_wash_service")
public class CarWashService {
    private String id;
    private String name;
    private String description;
    private Long price;
    private String imageUrl;
}
