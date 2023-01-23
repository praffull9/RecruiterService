package com.jobs.employer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobs.employer.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
