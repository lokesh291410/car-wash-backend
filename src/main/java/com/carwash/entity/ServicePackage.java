package com.carwash.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "service_package")
public class ServicePackage {
    private String id;
    private String packageName;
    private String description;
    private Long price;
}
