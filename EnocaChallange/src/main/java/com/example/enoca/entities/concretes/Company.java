package com.example.enoca.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "company_id")
    private int id;

    @Column (name = "company_name")
    private String companyName;

    @Column (name = "tax_number")
    private String taxNumber;

    @Column (name = "phone_number")
    private String phoneNumber;

    @Column (name = "adress")
    private String adress;

    @OneToMany(mappedBy = "company")
    private List<Employee> employees;
}
