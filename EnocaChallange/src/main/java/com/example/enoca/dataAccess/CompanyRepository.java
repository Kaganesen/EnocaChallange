package com.example.enoca.dataAccess;

import com.example.enoca.entities.concretes.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
