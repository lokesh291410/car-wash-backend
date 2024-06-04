package com.carwash.repository;

import com.carwash.entity.CustomService;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomServiceRepository extends MongoRepository<CustomService, String> {
}
