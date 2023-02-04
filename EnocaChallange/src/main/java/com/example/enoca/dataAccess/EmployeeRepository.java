package com.example.enoca.dataAccess;

import com.example.enoca.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    Optional<Employee> findByEmail(String email);
}
