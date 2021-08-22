package com.mhrs.mhrsdemo.business.abstracts;


import com.mhrs.mhrsdemo.core.utilities.results.*;
import com.mhrs.mhrsdemo.entities.concretes.User;
import com.mhrs.mhrsdemo.entities.dto.UserLoginDto;

public interface UserService  {

     DataResult<User> findByUserName(String userName);

     DataResult<User> findByNameAndPassword(String email,String password);

     Result add(User user);

     Result delete();

     Result update();


}
