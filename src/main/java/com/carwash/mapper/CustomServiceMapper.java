package com.carwash.mapper;

import com.carwash.dto.CarWashServiceDTO;
import com.carwash.dto.CustomServiceDTO;
import com.carwash.entity.CustomService;

public class CustomServiceMapper {
    public static CustomService mapToCustomService(CustomServiceDTO customServiceDTO) {
        return new CustomService(customServiceDTO.getId(),
                customServiceDTO.getServiceName(),
                customServiceDTO.getServices()
        );
    }
    public static CustomServiceDTO mapToCustomServiceDTO(CustomService customService) {
        return new CustomServiceDTO(customService.getId(),
                customService.getServiceName(),
                customService.getServices()
        );
    }
}
