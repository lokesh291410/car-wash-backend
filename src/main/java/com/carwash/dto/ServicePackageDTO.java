package com.carwash.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicePackageDTO {
    private String id;
    private String packageName;
    private String description;
    private Long price;
}
