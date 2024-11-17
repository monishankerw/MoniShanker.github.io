package com.curudAPI.protfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class PortfolioController {

    @GetMapping("/projects")
    public List<Map<String, String>> getProjects() {
        return List.of(
            Map.of("name", "Pay10PG", "description", "Secure payment platform using Spring Boot."),
            Map.of("name", "Shield Pay10", "description", "Risk management solution with JWT authentication."),
            Map.of("name", "MediMate", "description", "Healthcare backend with REST APIs.")
        );
    }
}