package com.mhrs.mhrsdemo.business.abstracts;


import com.mhrs.mhrsdemo.core.utilities.results.DataResult;
import com.mhrs.mhrsdemo.entities.concretes.Employer;

public interface EmployerService {

     DataResult<Employer> save (Employer employer);


}
