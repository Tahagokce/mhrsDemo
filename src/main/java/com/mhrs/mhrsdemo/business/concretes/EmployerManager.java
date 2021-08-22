package com.mhrs.mhrsdemo.business.concretes;


import com.mhrs.mhrsdemo.business.abstracts.EmployerService;
import com.mhrs.mhrsdemo.dataAccess.abstracts.EmployerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployerManager implements EmployerService {


    private EmployerDao employerDao ;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        super();
        this.employerDao = employerDao;

    }


}
