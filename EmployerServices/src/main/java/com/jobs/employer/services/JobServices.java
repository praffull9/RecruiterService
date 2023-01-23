package com.jobs.employer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.jobs.employer.entities.Job;
import com.jobs.employer.entities.JobResponseEntity;
import com.jobs.employer.entities.RecruiterResponseEntity;
import com.jobs.employer.repositories.JobRepository;

@Service
public class JobServices {
	
	@Autowired
	private KafkaTemplate<String, JobResponseEntity> kafkaTemplate;
	
	@Autowired
	private JobRepository jobRepo;
	
	@Autowired
	private RecruiterServices recruiterServices;
	
	
	
	
	public String addNewJobDetails(Job job)
	{
		JobResponseEntity jobResponseEntity=new JobResponseEntity();
		RecruiterResponseEntity recruiterResponseEntity=new RecruiterResponseEntity();
		String status="";
		
		
		//if(!recruiterResponseEntity.getRecruitername().isEmpty())
		try
		{
			recruiterResponseEntity=recruiterServices.getRecruiterInfo(job.getRecruiterid());
			jobResponseEntity.setId(job.getId());
			jobResponseEntity.setJobtitle(job.getJobtitle());
			jobResponseEntity.setRecruiterid(job.getRecruiterid());
			jobResponseEntity.setQualifications(job.getQualifications());
			jobResponseEntity.setLocations(job.getLocations());
			jobResponseEntity.setSkills(job.getSkills());
			jobResponseEntity.setResponsibilities(job.getResponsibilities());
			jobResponseEntity.setAnnualpackage(job.getAnnualpackage());
			jobResponseEntity.setExperience(job.getExperience());
			jobResponseEntity.setPostdate(job.getPostdate());
			jobResponseEntity.setJobstatus(job.getJobstatus());
			jobResponseEntity.setRecruiterResponseEntity(recruiterResponseEntity);
			System.out.println(jobResponseEntity);
			jobRepo.save(job);
			status="success";
			//-------------------------
			//Write the response JSON object on Apache Kafka Topic (Publish)
			//The job seeker application will pick data from kafka (Consume)
			//-------------------------
			kafkaTemplate.send("newjobs",jobResponseEntity);
			System.out.println("object published to kafka");

		}
		catch(Exception e)
		{
			status="failed";
		}
		return status;
		
	}

		
}
