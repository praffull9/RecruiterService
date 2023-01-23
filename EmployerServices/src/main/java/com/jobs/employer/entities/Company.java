package com.jobs.employer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="company")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int companyid;
	private String companyname;
	//start-up, medium, mnc
	private String category;
	//it,auto,pharma,healthcare
	private String industry;
	private String country;
	private int employees;
	private String companydesc;
	

}
