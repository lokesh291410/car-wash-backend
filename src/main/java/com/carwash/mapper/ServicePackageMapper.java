package com.carwash.mapper;

import com.carwash.dto.ServicePackageDTO;
import com.carwash.entity.ServicePackage;
import org.springframework.context.annotation.Bean;

public class ServicePackageMapper {
    public static ServicePackage mapToServicePackage(ServicePackageDTO servicePackageDTO) {
        return new ServicePackage(servicePackageDTO.getId(),
                servicePackageDTO.getPackageName(),
                servicePackageDTO.getDescription(),
                servicePackageDTO.getPrice()
        );
    }
    public static ServicePackageDTO mapToServicePackageDTO(ServicePackage servicePackage) {
        return new ServicePackageDTO(servicePackage.getId(),
                servicePackage.getPackageName(),
                servicePackage.getDescription(),
                servicePackage.getPrice()
        );
    }
}
