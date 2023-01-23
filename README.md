# Recruiter Service - Job publisher module
Spring boot service for recruiters to post jobs

!["architecture"](https://github.com/praffull9/RecruiterService/blob/9e828d439a6ad093a7ad66ea417246e272947fca/ServicesArchitecture.png "Architecture")

# This services performs following functionalities
- Register a company (MySQL cloud)
- Register a recruiter for a company (MySQL) 
- Post new jobs & store them in MongoDB Atlas on AWS
- Publish the Job, Company and Recruiter data on Apache Kafka Topic for Consumers to pick

# Tools used to development
- Java17
- Spring Boot 2.7.8
- JPA
- MongoDB
- MySQL
- Eureka Client (Removed temporarily)
- Spring security (Google OAuth2)

> # Please go through the PDF for more details and screenshots

Developed by
Praffull Manekar

