package com.carwash.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarWashServiceDTO {
    private String id;
    private String name;
    private String description;
    private Long price;
    private String imageUrl;
}
