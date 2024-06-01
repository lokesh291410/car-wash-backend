package com.carwash.service.impl;

import com.carwash.service.AIService;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.api.Part;
import com.google.cloud.vertexai.generativeai.ContentMaker;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import com.google.cloud.vertexai.generativeai.PartMaker;
import com.google.protobuf.ByteString;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class AIServiceImpl implements AIService {

    private final GenerativeModel generativeModel;
    @Override
    public ResponseEntity<?> analyzeImages(MultipartFile images) throws IOException {
        //List<Part> parts = toParts(images);
        Part part = PartMaker.fromMimeTypeAndData(
                Objects.requireNonNull(images.getContentType()),
                ByteString.copyFrom(images.getBytes())
        );
        //System.out.println("nice");

        String service = "Quick Wash(exterior)," +
                "Basic Wash(exterior + interior)," +
                " Deluxe Wash(Enhanced exterior wash with wax and interior cleaning)," +
                " Premium Detailing(Full-service wash, interior detailing, and additional services like tire dressing or rain repellent),";

        String prompt = "analyze these images and recommend a car wash service from the list of available services: " + service;

        GenerateContentResponse response = generativeModel
                .generateContent(
                        ContentMaker.fromMultiModalData(part, prompt)
                );
        System.out.println(response.toString());
        return ResponseEntity.ok(response.toString());
    }

    private List<Part> toParts(List<MultipartFile> images) {
        return images.stream()
                .map(image -> {
                    try {
                        return PartMaker
                                .fromMimeTypeAndData(
                                        Objects.requireNonNull(image.getContentType()),
                                        ByteString.copyFrom(image.getBytes())
                                );
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }).toList();
    }
}

