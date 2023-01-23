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
@Table(name="recruiter")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Recruiter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recruiterid;
	private String recruitername;
	private int companyid;
	private String mobilenumber;
	private String emailid;
	private String city;
	
	//Constructors, Setters and Getters are covered by lombok
	

}
