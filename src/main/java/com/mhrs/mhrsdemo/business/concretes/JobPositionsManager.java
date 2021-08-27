package com.mhrs.mhrsdemo.business.concretes;

import com.mhrs.mhrsdemo.business.abstracts.JobPositionService;
import com.mhrs.mhrsdemo.core.utilities.results.*;
import com.mhrs.mhrsdemo.dataAccess.abstracts.JopPositionDao;
import com.mhrs.mhrsdemo.entities.concretes.JobPosition;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class    JobPositionsManager implements JobPositionService {

    private final JopPositionDao jopPositionDao ;




    @Override
    public DataResult<List<JobPosition>> getAll() {

        var result = this.jopPositionDao.findAll();

        return new SuccessDataResult<List<JobPosition>>(result,"Başarılı");

    }

    @Override
    public Result save(JobPosition jobPosition) {

        this.jopPositionDao.save(jobPosition);

        return new SuccessResult("Başarılı");
    }
}
