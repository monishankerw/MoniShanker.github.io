package com.curudAPI.service;

import com.curudAPI.entity.Department;
import com.curudAPI.entity.Employees;
import com.curudAPI.entity.Organization;
import com.curudAPI.repository.OrganizationRepository;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public Organization saveOrganization(String jsonPayload) {
        JSONObject jsonObject = new JSONObject(jsonPayload);

        // Map Organization details
        Organization organization = new Organization();
        organization.setOrganizationName(jsonObject.getString("organizationName"));
        organization.setRegistrationId(jsonObject.getInt("registrationId"));

        log.info("Mapped Organization details: {}", organization);

        // Parse Departments
        JSONArray departmentsJson = jsonObject.getJSONArray("departments");
        List<Department> departmentList = new ArrayList<>();

        for (int i = 0; i < departmentsJson.length(); i++) {
            JSONObject departmentJson = departmentsJson.getJSONObject(i);

            Department department = new Department();
            department.setDepartmentName(departmentJson.getString("departmentName"));

            log.info("Mapped Department details: {}", department);

            // Parse Employees
            JSONArray employeesJson = departmentJson.getJSONArray("employees");
            List<Employees> employeeList = new ArrayList<>();

            for (int j = 0; j < employeesJson.length(); j++) {
                JSONObject employeeJson = employeesJson.getJSONObject(j);

                Employees employee = new Employees();
                employee.setEmployeeId(employeeJson.getInt("employeeId"));
                employee.setEmployeeName(employeeJson.getString("employeeName"));

                // Parse Skills
                JSONArray skillsJson = employeeJson.getJSONArray("skills");
                List<String> skills = new ArrayList<>();
                for (int k = 0; k < skillsJson.length(); k++) {
                    skills.add(skillsJson.getString(k));
                }
                employee.setSkills(skills);

                log.info("Mapped Employee details: {}", employee);

                employeeList.add(employee);
            }

            department.setEmployees(employeeList);
            departmentList.add(department);
        }

        organization.setDepartments(departmentList);

        // Parse Policies
        JSONObject policiesJson = jsonObject.getJSONObject("policies");
        Map<String, Map<String, Object>> policies = new HashMap<>();
        for (String policyKey : policiesJson.keySet()) {
            JSONObject policyDetailsJson = policiesJson.getJSONObject(policyKey);
            Map<String, Object> policyDetails = new HashMap<>();
            for (String detailKey : policyDetailsJson.keySet()) {
                policyDetails.put(detailKey, policyDetailsJson.get(detailKey));
            }
            policies.put(policyKey, policyDetails);
        }
        organization.setPolicies(policies);

        log.info("Mapped Policies: {}", policies);

        // Save to repository
        return organizationRepository.save(organization);
    }
}