package com.mhrs.mhrsdemo.business.abstracts;

import com.mhrs.mhrsdemo.core.utilities.results.*;
import com.mhrs.mhrsdemo.entities.concretes.JobPosition;

import java.util.List;


public interface JobPositionService {


    DataResult<List<JobPosition>> getAll();

    Result save(JobPosition jobPosition);
}

