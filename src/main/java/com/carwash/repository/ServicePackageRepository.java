package com.carwash.repository;

import com.carwash.entity.ServicePackage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServicePackageRepository extends MongoRepository<ServicePackage, String> {

}
