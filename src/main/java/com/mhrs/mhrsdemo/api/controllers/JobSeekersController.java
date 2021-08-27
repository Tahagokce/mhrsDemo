package com.mhrs.mhrsdemo.api.controllers;



import com.mhrs.mhrsdemo.business.abstracts.JobSeekerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobseekers")
@RequiredArgsConstructor
public class JobSeekersController {

    private final JobSeekerService jobSeekerService;

}
