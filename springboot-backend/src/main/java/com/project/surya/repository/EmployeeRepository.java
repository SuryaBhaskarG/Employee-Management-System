package com.project.surya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.surya.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
