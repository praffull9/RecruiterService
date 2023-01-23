package com.jobs.employer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.employer.entities.Company;
import com.jobs.employer.services.CompanyServices;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyServices companyServices;
	
	@PostMapping("/add")
	public Company addNewCompany(@RequestBody Company company)
	{
		return companyServices.addCompany(company);
	}
	
	@GetMapping("/all")
	public List<Company> getAllCompanies()
	{
		return companyServices.getCompanies();
	}
	
	@GetMapping("/search/{companyid}")
	public Company searchCompany(@PathVariable("companyid") int companyid)
	{
		return companyServices.getCompanyInfo(companyid);
	}

}
