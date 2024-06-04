package com.carwash.repository;

import com.carwash.entity.CarWashService;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarWashServiceRepository extends MongoRepository<CarWashService, String> {
}
