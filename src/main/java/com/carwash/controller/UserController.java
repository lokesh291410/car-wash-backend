package com.carwash.controller;

import com.carwash.service.AIService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final AIService aiService;

    @PostMapping("/service-suggestions")
    public ResponseEntity<?> getCarWashServiceSuggestions(@RequestPart("images") MultipartFile images) throws IOException {
        //System.out.println("good");
        return aiService.analyzeImages(images);
    }
}
