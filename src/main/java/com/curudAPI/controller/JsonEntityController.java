package com.curudAPI.controller;

import com.curudAPI.entity.JsonEntity;
import com.curudAPI.service.JsonEntityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/json-entity")
public class JsonEntityController {

    private final JsonEntityService jsonEntityService;

    public JsonEntityController(JsonEntityService jsonEntityService) {
        this.jsonEntityService = jsonEntityService;
    }

    @PostMapping("/save")
    public ResponseEntity<JsonEntity> saveJson(@RequestBody String jsonPayload) {
        JsonEntity savedEntity = jsonEntityService.saveJson(jsonPayload);
        return ResponseEntity.ok(savedEntity);
    }
}