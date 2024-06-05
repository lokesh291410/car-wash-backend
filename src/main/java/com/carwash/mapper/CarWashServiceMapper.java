package com.carwash.mapper;

import com.carwash.dto.CarWashServiceDTO;
import com.carwash.entity.CarWashService;

public class CarWashServiceMapper {
    public static CarWashService mapToCarWashService(CarWashServiceDTO carWashServiceDTO) {
        return new CarWashService(carWashServiceDTO.getId(),
                carWashServiceDTO.getName(),
                carWashServiceDTO.getDescription(),
                carWashServiceDTO.getPrice(),
                carWashServiceDTO.getImageUrl()
        );
    }
    public static CarWashServiceDTO mapToCarWashServiceDTO(CarWashService carWashService) {
        return new CarWashServiceDTO(carWashService.getId(),
                carWashService.getName(),
                carWashService.getDescription(),
                carWashService.getPrice(),
                carWashService.getImageUrl()
        );
    }
}
