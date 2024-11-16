package com.curudAPI.dto;

public class EmployeeDTO {
    
    private int id;
    private String nameUser; // Changed name to nameUser
    private String role;
    private String department;

    // Constructor
    public EmployeeDTO(int id, String nameUser, String role, String department) {
        this.id = id;
        this.nameUser = nameUser;
        this.role = role;
        this.department = department;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}