package com.curudAPI.parsing;

import com.curudAPI.parsing.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class EmployeesController {

    private final EmployeesService employeesService;

    /**
     * Save Employee Endpoint
     * @param jsonString JSON String containing employee details
     * @return ResponseEntity with status and saved employee details
     */
    @PostMapping("/employees")
    public ResponseEntity<?> saveEmp(@RequestBody String jsonString) {
        try {
            // Save employee using service
            List<EmployeeDto> empDto = employeesService.saveEmp(jsonString);

            return ResponseEntity.ok(empDto);
        } catch (EmployeeNotFoundException ex) {
            // Handle case where employee is not found (404)
            log.error("Employee not found: {}", ex.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found: " + ex.getMessage());
        } catch (Exception ex) {
            // Handle other errors (500)
            log.error("An error occurred while saving employee: {}", ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An internal error occurred: " + ex.getMessage());
        }
    }
}
