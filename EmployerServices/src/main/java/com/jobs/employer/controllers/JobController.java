package com.jobs.employer.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.employer.entities.Job;
import com.jobs.employer.services.JobServices;

@RestController
@RequestMapping("/jobs")
@ComponentScan("com.jobs.employer.services")
public class JobController {
	
	@Autowired
	private JobServices jobServices;

	@PostMapping("/add")
	public ResponseEntity<String> addNewJob(@RequestBody Job job)
	{
		if(jobServices.addNewJobDetails(job).equals("success"))
			return new ResponseEntity<>("Job Posted", HttpStatus.OK);
		else
			return new ResponseEntity<>("Failed", HttpStatus.BAD_REQUEST);
	}
}
