package com.mhrs.mhrsdemo.business.abstracts;


import com.mhrs.mhrsdemo.core.utilities.results.*;
import com.mhrs.mhrsdemo.entities.concretes.User;
import com.mhrs.mhrsdemo.entities.dto.UserLoginDto;

public interface UserService  {

     DataResult<User> getByEmail(String email);

     DataResult<User> findByNameAndPassword(String email,String password);

     Result save(User user);

     DataResult<User> getById(int id);

     Result delete(User user);

     Result update(User user);


}
