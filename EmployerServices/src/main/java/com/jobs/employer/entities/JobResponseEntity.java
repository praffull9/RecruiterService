package com.jobs.employer.entities;

//Developed by Praffull Manekar on 21 January 2023
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class JobResponseEntity {
	
	private String id;
	private String jobtitle;
	private int recruiterid;
	private List<String> qualifications;
	private List<String> locations;
	private List<String> skills;
	private List<String> responsibilities;
	private double annualpackage;
	private String experience;
	private String postdate; 
	private String jobstatus;	
	private RecruiterResponseEntity recruiterResponseEntity;

}
