package com.curudAPI.parsing.service.impl;

import com.curudAPI.parsing.EmployeeDto;
import com.curudAPI.parsing.Employees;
import com.curudAPI.parsing.EmployeesRepository;
import com.curudAPI.parsing.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeesService {

    private final EmployeesRepository employeesRepository;

    @Override
    public List<EmployeeDto> saveEmp(String jsonString) {
        log.info("Starting saveEmp method. Input JSON String: {}", jsonString);

        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray jsonArray = jsonObject.getJSONArray("employee");
        log.info("Parsed JSON array of employees with length: {}", jsonArray.length());

        List<EmployeeDto> employeeDtos = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                JSONObject empJson = jsonArray.getJSONObject(i);
                log.info("Processing employee JSON object: {}", empJson);

                // Map JSON to Employees entity
                Employees employees = new Employees();
                employees.setId(empJson.getLong("id"));
                employees.setName(empJson.getString("name"));
                employees.setSkills(
                        empJson.getJSONArray("skills").toList().stream()
                                .map(Object::toString)
                                .collect(Collectors.toList())
                );
                log.debug("Mapped JSON object to Employees entity: {}", employees);

                // Save entity to the repository
                Employees savedEmp = employeesRepository.save(employees);
                log.info("Saved employee to database: {}", savedEmp);

                // Map entity to DTO
                EmployeeDto employeeDto = new EmployeeDto();
                employeeDto.setId(savedEmp.getId());
                employeeDto.setName(savedEmp.getName());
                employeeDto.setSkills(savedEmp.getSkills());
                log.debug("Mapped saved entity to EmployeeDto: {}", employeeDto);

                employeeDtos.add(employeeDto);
            } catch (Exception ex) {
                log.error("Error processing employee at index {}: {}", i, ex.getMessage(), ex);
            }
        }

        log.info("Finished processing employees. Total processed: {}", employeeDtos.size());
        return employeeDtos;
    }
}
