package com.mhrs.mhrsdemo.business.concretes;


import com.mhrs.mhrsdemo.business.abstracts.UserService;
import com.mhrs.mhrsdemo.core.utilities.results.*;
import com.mhrs.mhrsdemo.dataAccess.abstracts.UserDao;
import com.mhrs.mhrsdemo.entities.concretes.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {

    private final UserDao userDao ;



    @Override
    public DataResult<User> getByEmail(String email) {

        var result =  this.userDao.getByEmail(email);
        if (result!= null){
            return new SuccessDataResult(result,"Başarılı");
        }
        return new ErrorDataResult<User>("hata");
    }

    @Override

    public DataResult<User> findByNameAndPassword(String email,String password) {

       var result = this.userDao.findByEmailAndPassword(email,password);
        if (result!= null){
            return new SuccessDataResult(result,"Başarılı");
        }
        return new ErrorDataResult<User>("hata");

    }

    @Override
    public Result save(User user) {

        var result = this.userDao.save(user);
        if (result!=null){
        return new SuccessResult("başarılı");
        }
        return new ErrorResult("Hata");
    }

    @Override
    public DataResult<User> getById(int id) {

        var result = this.userDao.findById(id);
        if (result!= null){
            return new SuccessDataResult(result,"Başarılı");
        }
        return new ErrorDataResult<User>("hata");
    }

    @Override
    public Result delete(User user) {
        this.userDao.delete(user);
        var result =  this.userDao.getByEmailAndPassword(user.getEmail(),user.getPassword());
        if (result != null)
        {
            return new ErrorResult("Kullanıcı silinemedi");
        }
        return new SuccessResult("Kullanıcı başarıyla silindi");
    }

    @Override
    public Result update(User user) {

       var result = this.update(user);
       if (result.isSuccess())
       {
           return new SuccessResult(result.getMessage());
       }

        return new ErrorResult(result.getMessage());
    }
}
