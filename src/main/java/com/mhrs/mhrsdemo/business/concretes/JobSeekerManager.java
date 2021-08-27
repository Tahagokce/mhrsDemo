package com.mhrs.mhrsdemo.business.concretes;

import com.mhrs.mhrsdemo.business.abstracts.JobSeekerService;
import com.mhrs.mhrsdemo.dataAccess.abstracts.JobSeekerDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobSeekerManager implements JobSeekerService {


    private final JobSeekerDao jobSeekerDao ;

}
