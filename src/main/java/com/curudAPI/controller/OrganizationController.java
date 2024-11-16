package com.curudAPI.controller;

import com.curudAPI.entity.Organization;
;
import com.curudAPI.service.OrganizationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organization")
public class OrganizationController {

    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping("/save")
    public ResponseEntity<Organization> saveOrganization(@RequestBody String jsonPayload) {
        Organization savedOrganization = organizationService.saveOrganization(jsonPayload);
        return ResponseEntity.ok(savedOrganization);
    }
}