package com.mhrs.mhrsdemo.dataAccess.abstracts;


import com.mhrs.mhrsdemo.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

}
