package com.mhrs.mhrsdemo.api.controllers;


import com.mhrs.mhrsdemo.business.abstracts.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employer")
public class EmployersController {

    private EmployerService employerService ;

    @Autowired
    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }
}
