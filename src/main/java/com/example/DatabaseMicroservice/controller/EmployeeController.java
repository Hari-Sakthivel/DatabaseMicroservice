package com.example.DatabaseMicroservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DatabaseMicroservice.entity.Employee;
import com.example.DatabaseMicroservice.service.EmployeeService;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){

        log.info("Retrived {} employees data from database");
        return employeeService.getAllEmployees();

    }
}