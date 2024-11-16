package com.curudAPI.service;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonWithMultipleLists {
    public static void main(String[] args) {
        String jsonString = """
            {
              "organizationName": "Tech Solutions",
              "registrationId": 67890,
              "departments": [
                {
                  "departmentName": "Engineering",
                  "employees": [
                    {
                      "employeeId": 101,
                      "employeeName": "John Smith",
                      "skills": ["Java", "Spring Boot", "Kubernetes"]
                    },
                    {
                      "employeeId": 102,
                      "employeeName": "Alice Brown",
                      "skills": ["Python", "Django", "AWS"]
                    }
                  ]
                },
                {
                  "departmentName": "Marketing",
                  "employees": [
                    {
                      "employeeId": 201,
                      "employeeName": "Mark Lee",
                      "skills": ["SEO", "Google Ads", "Content Writing"]
                    }
                  ]
                }
              ],
              "policies": {
                "leavePolicy": {
                  "sickLeave": 12,
                  "casualLeave": 15
                },
                "workPolicy": {
                  "remoteWorkAllowed": true,
                  "officeHours": "9AM to 6PM"
                }
              }
            }
        """;

        // Parse JSON string into a JSONObject
        JSONObject jsonObject = new JSONObject(jsonString);

        // Convert to HashMap
        Map<String, Object> organizationMap = jsonToMap(jsonObject);

        // Print the resulting HashMap
        System.out.println("Organization Map: " + organizationMap);

        // Fetching details from the map
        printDetails(organizationMap);
    }

    // Convert JSONObject to HashMap
    public static Map<String, Object> jsonToMap(JSONObject jsonObject) {
        Map<String, Object> map = new HashMap<>();

        for (String key : jsonObject.keySet()) {
            Object value = jsonObject.get(key);

            if (value instanceof JSONObject) {
                // Recursively convert JSONObject to Map
                map.put(key, jsonToMap((JSONObject) value));
            } else if (value instanceof JSONArray) {
                // Convert JSONArray to List
                map.put(key, jsonArrayToList((JSONArray) value));
            } else {
                map.put(key, value);
            }
        }

        return map;
    }

    // Convert JSONArray to List
    public static List<Object> jsonArrayToList(JSONArray jsonArray) {
        List<Object> list = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++) {
            Object value = jsonArray.get(i);

            if (value instanceof JSONObject) {
                // Recursively convert JSONObject to Map
                list.add(jsonToMap((JSONObject) value));
            } else if (value instanceof JSONArray) {
                // Recursively convert JSONArray to List
                list.add(jsonArrayToList((JSONArray) value));
            } else {
                list.add(value);
            }
        }

        return list;
    }

    // Extract and print details from the map
    public static void printDetails(Map<String, Object> organizationMap) {
        System.out.println("\n--- Organization Details ---");

        String organizationName = (String) organizationMap.get("organizationName");
        System.out.println("Organization Name: " + organizationName);

        Integer registrationId = (Integer) organizationMap.get("registrationId");
        System.out.println("Registration ID: " + registrationId);

        List<Map<String, Object>> departments = (List<Map<String, Object>>) organizationMap.get("departments");
        for (Map<String, Object> department : departments) {
            String departmentName = (String) department.get("departmentName");
            System.out.println("\nDepartment: " + departmentName);

            List<Map<String, Object>> employees = (List<Map<String, Object>>) department.get("employees");
            for (Map<String, Object> employee : employees) {
                System.out.println("  Employee Name: " + employee.get("employeeName"));
                System.out.println("  Skills: " + employee.get("skills"));
            }
        }

        Map<String, Object> policies = (Map<String, Object>) organizationMap.get("policies");
        Map<String, Object> leavePolicy = (Map<String, Object>) policies.get("leavePolicy");
        System.out.println("\nLeave Policy: " + leavePolicy);

        Map<String, Object> workPolicy = (Map<String, Object>) policies.get("workPolicy");
        System.out.println("Work Policy: " + workPolicy);
    }
}