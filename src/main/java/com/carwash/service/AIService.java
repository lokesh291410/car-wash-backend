package com.carwash.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface AIService {
    ResponseEntity<?> analyzeImages(MultipartFile images) throws IOException;
}
