package com.mhrs.mhrsdemo.business.concretes;


import com.mhrs.mhrsdemo.business.abstracts.EmployerService;
import com.mhrs.mhrsdemo.core.utilities.results.DataResult;
import com.mhrs.mhrsdemo.core.utilities.results.SuccessDataResult;
import com.mhrs.mhrsdemo.dataAccess.abstracts.EmployerDao;
import com.mhrs.mhrsdemo.entities.concretes.Employer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EmployerManager implements EmployerService {


    private final EmployerDao employerDao ;



    public DataResult<Employer> save (Employer employer){
         var result = this.employerDao.save(employer  );
        return new SuccessDataResult<Employer>(result,"Başarılı");
    }


}
