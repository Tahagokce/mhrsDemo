package com.mhrs.mhrsdemo.business.concretes;

import com.mhrs.mhrsdemo.business.abstracts.JobSeekerService;
import com.mhrs.mhrsdemo.dataAccess.abstracts.JobSeekerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerManager implements JobSeekerService {


    private JobSeekerDao jobSeekerDao ;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }
}
