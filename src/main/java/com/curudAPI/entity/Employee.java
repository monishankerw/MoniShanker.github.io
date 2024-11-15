package com.curudAPI.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "employees")

public class Employee {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    public static enum Role {
        ADMIN, USER, SUBUSER, MERCHANT
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}