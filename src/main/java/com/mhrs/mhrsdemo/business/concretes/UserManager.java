package com.mhrs.mhrsdemo.business.concretes;


import com.mhrs.mhrsdemo.business.abstracts.UserService;
import com.mhrs.mhrsdemo.core.utilities.results.*;
import com.mhrs.mhrsdemo.dataAccess.abstracts.UserDao;
import com.mhrs.mhrsdemo.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao ;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public DataResult<User> findByUserName(String userName) {
        return null;
    }

    @Override
    public DataResult<User> findByNameAndPassword(String email,String password) {

       var result = this.userDao.findByEmailAndPassword(email,password);
        return new SuccessDataResult(result,"Başarılı");
    }

    @Override
    public Result add(User user) {

        var result = this.userDao.save(user);
        return new SuccessResult("başarılı");
    }

    @Override
    public Result delete() {
        return null;
    }

    @Override
    public Result update() {
        return null;
    }
}
