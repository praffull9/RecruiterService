package com.jobs.employer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobs.employer.entities.Company;
import com.jobs.employer.entities.Recruiter;
import com.jobs.employer.entities.RecruiterResponseEntity;
import com.jobs.employer.repositories.CompanyRepository;
import com.jobs.employer.repositories.RecruiterRepository;

@Service
public class RecruiterServices {
	
	@Autowired
	private RecruiterRepository recruiterRepo;
	
	@Autowired
	private CompanyRepository companyRepo;
	
	public Recruiter addRecruiter(Recruiter recruiter)
	{
		return recruiterRepo.save(recruiter);
	}
	
	public List<Recruiter> getRecruiters()
	{
		return recruiterRepo.findAll();
	}
	
	public RecruiterResponseEntity getRecruiterInfo(int recruiterid)
	{
		Recruiter recruiter= recruiterRepo.findById(recruiterid).get();
		RecruiterResponseEntity recruiterResponseEntity=new RecruiterResponseEntity();
		recruiterResponseEntity.setRecruiterid(recruiter.getRecruiterid());
		recruiterResponseEntity.setRecruitername(recruiter.getRecruitername());
		recruiterResponseEntity.setCompanyid(recruiter.getCompanyid());
		recruiterResponseEntity.setMobilenumber(recruiter.getMobilenumber());
		recruiterResponseEntity.setEmailid(recruiter.getEmailid());
		recruiterResponseEntity.setCity(recruiter.getCity());
		
		Company comp=companyRepo.findById(recruiter.getCompanyid()).get();
		recruiterResponseEntity.setCompany(comp);
		return recruiterResponseEntity;
	}

}
