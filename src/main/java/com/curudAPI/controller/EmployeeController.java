package com.curudAPI.controller;

import com.curudAPI.service.EmployeeService;
import org.json.JSONArray;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

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
        JSONArray employees = service.fetchAllEmployees();
        return ResponseEntity.ok(employees.toString(4)); // Pretty print JSON
    }
}