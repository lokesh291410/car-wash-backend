package com.carwash.configuration;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VertexAIConfig {

    @Value("${GOOGLE_CLOUD_PROJECT_ID}")
    private String projectId;

    @Value("${GOOGLE_CLOUD_LOCATION}")
    private String location;

    @Value("${GOOGLE_CLOUD_MODEL_NAME}")
    private String modelName;

    @Bean
    public VertexAI vertexAI() {
        return new VertexAI(projectId, location);
    }

    @Bean
    public GenerativeModel generativeModel() {
        return new GenerativeModel(modelName, vertexAI());
    }
}
