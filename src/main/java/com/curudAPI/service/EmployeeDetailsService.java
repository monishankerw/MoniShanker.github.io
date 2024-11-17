package com.curudAPI.service;


import com.curudAPI.entity.EmployeeDetails;
import com.curudAPI.repository.EmployeeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EmployeeDetailsService {

    private final EmployeeDetailsRepository employeeRepository;

    @Autowired
    public EmployeeDetailsService(EmployeeDetailsRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDetails saveNestedJSON(Map<String, Object> payload) {
        // Parse JSON and create an Employee object
        EmployeeDetails employee = new EmployeeDetails();
        employee.setEmployeeName((String) payload.get("employeeName"));
        employee.setEmployeeId((Integer) payload.get("employeeId"));

        @SuppressWarnings("unchecked")
        Map<String, String> contactDetails = (Map<String, String>) payload.get("contactDetails");
        employee.setContactDetails(contactDetails);

        // Save Employee to DB
        return employeeRepository.save(employee);
    }
}
