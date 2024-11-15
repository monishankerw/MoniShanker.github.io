package com.curudAPI.service;

import com.curudAPI.entity.Employee;
import com.curudAPI.repository.EmployeeRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Save employees to the database
    public void saveEmployees(JSONArray jsonArray) {
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            Employee employee = new Employee();
            employee.setId(jsonObject.getInt("id"));
            employee.setName(jsonObject.getString("name"));
            employee.setRole(Employee.Role.valueOf(jsonObject.getString("role").toUpperCase()));

            employees.add(employee);
        }

        repository.saveAll(employees);
    }
    public JSONArray fetchAllEmployees() {
        logger.info("Fetching all employees from the database.");

        try {
            List<Employee> employees = repository.findAll();
            logger.debug("Fetched {} employees from the database.", employees.size());

            JSONArray jsonArray = new JSONArray();

            for (Employee employee : employees) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("id", employee.getId());
                jsonObject.put("name", employee.getName());
                jsonObject.put("role", employee.getRole().toString().toLowerCase());
                jsonArray.put(jsonObject);
            }

            logger.info("Successfully converted employees to JSON format.");
            return jsonArray;
        } catch (Exception e) {
            logger.error("Error occurred while fetching employees: {}", e.getMessage(), e);
            throw e; // Rethrow exception to propagate it further.
        }
    }

}
