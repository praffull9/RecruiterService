package com.jobs.employer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.employer.entities.Recruiter;
import com.jobs.employer.entities.RecruiterResponseEntity;
import com.jobs.employer.services.RecruiterServices;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {
	
	@Autowired
	private RecruiterServices recruiterServices;
	
	@PostMapping("/add")
	public Recruiter addNewRecruiter(@RequestBody Recruiter recruiter)
	{
		return recruiterServices.addRecruiter(recruiter);
	}
	
	@GetMapping("/all")
	public List<Recruiter> getAllRecruiters()
	{
		return recruiterServices.getRecruiters();
	}
	
	@GetMapping("/search/{recruiterid}")
	public RecruiterResponseEntity searchRecruiter(@PathVariable("recruiterid") int recruiterid)
	{
		return recruiterServices.getRecruiterInfo(recruiterid);
	}

}
