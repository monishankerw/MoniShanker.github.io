package com.curudAPI.controller;

import com.curudAPI.service.EmployeeService;
import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // Endpoint to store employee data
    @PostMapping("/store")
    public ResponseEntity<String> storeEmployees(@RequestBody String jsonArrayString) {
        JSONArray jsonArray = new JSONArray(jsonArrayString);
        service.saveEmployees(jsonArray);
        return ResponseEntity.ok("Employees saved successfully.");
    }
    @GetMapping("/fetch")
    public ResponseEntity<String> fetchEmployees() {
        logger.info("Received request to fetch all employees.");

        try {
            JSONArray employees = service.fetchAllEmployees();
            logger.info("Successfully fetched {} employees from the database.", employees.length());
            return ResponseEntity.ok(employees.toString(4)); // Pretty print JSON
        } catch (Exception e) {
            logger.error("Error occurred while fetching employees: {}", e.getMessage(), e);
            return ResponseEntity.status(500).body("Internal Server Error: Unable to fetch employees.");
        }
    }
}
