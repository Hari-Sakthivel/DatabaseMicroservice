package com.example.DatabaseMicroservice.repository;

import com.example.DatabaseMicroservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
