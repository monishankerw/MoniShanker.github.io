package com.curudAPI.parsing.service;

import com.curudAPI.parsing.EmployeeDto;

import java.util.List;


public interface EmployeesService {
    public List<EmployeeDto> saveEmp(String jsonString);
}
