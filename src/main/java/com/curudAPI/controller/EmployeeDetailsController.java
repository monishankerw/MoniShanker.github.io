package com.curudAPI.controller;

import com.curudAPI.entity.EmployeeDetails;
import com.curudAPI.service.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/api/employees")
public class EmployeeDetailsController {

    private final EmployeeDetailsService employeeService;

    @Autowired
    public EmployeeDetailsController(EmployeeDetailsService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save-json")
    public ResponseEntity<EmployeeDetails> saveNestedJSON(@RequestBody Map<String, Object> payload) {
        // Delegate to service
        EmployeeDetails savedEmployee = employeeService.saveNestedJSON(payload);
        return ResponseEntity.ok(savedEmployee);
    }
}