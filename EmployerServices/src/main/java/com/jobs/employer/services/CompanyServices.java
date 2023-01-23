package com.jobs.employer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobs.employer.entities.Company;
import com.jobs.employer.repositories.CompanyRepository;

@Service
public class CompanyServices {

	@Autowired
	private CompanyRepository companyRepo;
	
	public Company addCompany(Company company)
	{
		return companyRepo.save(company);
	}
	
	public List<Company> getCompanies()
	{
		return companyRepo.findAll();
	}
	
	public Company getCompanyInfo(int companyid)
	{
		return companyRepo.findById(companyid).get();
	}
}
