package com.curudAPI.parsing;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity(name = "ParsingEmployees")

@Table(name="employeess")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private List<String> skills;
}
