package com.curudAPI.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "organization")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String organizationName;
    private Integer registrationId;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "organization_id")
    private List<Department> departments;

    @Lob
    @Column(columnDefinition = "TEXT") // Use "JSON" if your DB supports JSON types
    private String policiesJson;

    @Transient
    private Map<String, Map<String, Object>> policies;

    @PostLoad
    private void loadPolicies() throws IOException {
        if (policiesJson != null) {
            ObjectMapper objectMapper = new ObjectMapper();
            this.policies = objectMapper.readValue(policiesJson, new TypeReference<>() {});
        }
    }

    @PrePersist
    @PreUpdate
    private void savePolicies() throws IOException {
        if (policies != null) {
            ObjectMapper objectMapper = new ObjectMapper();
            this.policiesJson = objectMapper.writeValueAsString(policies);
        }
    }
}