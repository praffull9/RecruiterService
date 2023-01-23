package com.jobs.employer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobs.employer.entities.Recruiter;

public interface RecruiterRepository extends JpaRepository<Recruiter, Integer> {

}
