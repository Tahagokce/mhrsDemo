package com.mhrs.mhrsdemo.business.concretes;

import com.mhrs.mhrsdemo.business.abstracts.JobPositionService;
import com.mhrs.mhrsdemo.core.utilities.results.*;
import com.mhrs.mhrsdemo.dataAccess.abstracts.JopPositionDao;
import com.mhrs.mhrsdemo.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionsManager implements JobPositionService {

    private JopPositionDao jopPositionDao ;


    @Autowired
    public JobPositionsManager(JopPositionDao jopPositionDao) {
        super();
        this.jopPositionDao = jopPositionDao;
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {

        var result = this.jopPositionDao.findAll();

        return new SuccessDataResult<List<JobPosition>>(result,"Başarılı");

    }

    @Override
    public Result add(JobPosition jobPosition) {

        this.jopPositionDao.save(jobPosition);

        return new SuccessResult("Başarılı");
    }
}
