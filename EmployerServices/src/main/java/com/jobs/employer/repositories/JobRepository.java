package com.jobs.employer.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jobs.employer.entities.Job;

public interface JobRepository extends MongoRepository<Job, String> {
	public List<Job> findBySkills(String skill);
	public List<Job> findByLocations(String location);
	public List<Job> findBySkillsAndLocations(String skill,String location);
	
}
