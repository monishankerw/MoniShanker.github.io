package com.curudAPI.entity;

import jakarta.persistence.*;

import java.util.Map;

@Entity
@Table(name="emp")
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeName;

    private Integer employeeId;

    @ElementCollection
   // @CollectionTable(name = "employee_contact_details", joinColumns = @JoinColumn(name = "employee_id"))
//    @MapKeyColumn(name = "key")
//    @Column(name = "value")
    private Map<String, String> contactDetails;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Map<String, String> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(Map<String, String> contactDetails) {
        this.contactDetails = contactDetails;
    }
}