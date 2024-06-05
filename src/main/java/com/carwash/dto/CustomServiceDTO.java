package com.carwash.dto;

import com.carwash.entity.CarWashService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomServiceDTO {
    private String id;
    private String serviceName;
    private List<CarWashService> services;
}
