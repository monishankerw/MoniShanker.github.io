package com.curudAPI.service;

import com.curudAPI.entity.JsonEntity;
import com.curudAPI.repository.JsonEntityRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class JsonEntityService {

    private final JsonEntityRepository jsonEntityRepository;
    private final ObjectMapper objectMapper;

    public JsonEntityService(JsonEntityRepository jsonEntityRepository, ObjectMapper objectMapper) {
        this.jsonEntityRepository = jsonEntityRepository;
        this.objectMapper = objectMapper;
    }

    public JsonEntity saveJson(String jsonPayload) {
        try {
            // Parse JSON into a HashMap
            ObjectMapper mapper = new ObjectMapper();
            HashMap<String, Object> jsonMap = mapper.readValue(jsonPayload, HashMap.class);

            // Extract fields
            String name = (String) jsonMap.get("name");
            Long identifier = Long.valueOf(jsonMap.get("id").toString());
            Object policies = jsonMap.get("policies");

            // Convert policies back to JSON string
            String policiesJson = mapper.writeValueAsString(policies);

            // Create and save entity
            JsonEntity entity = new JsonEntity();
            entity.setName(name);
            entity.setIdentifier(identifier);
            entity.setPolicies(policiesJson);

            return jsonEntityRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException("Error while saving JSON data", e);
        }
    }
}