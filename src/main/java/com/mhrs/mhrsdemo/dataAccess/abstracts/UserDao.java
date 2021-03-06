package com.mhrs.mhrsdemo.dataAccess.abstracts;


import com.mhrs.mhrsdemo.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {


    User getByEmail(String email);

    User getByEmailAndPassword (String email, String  password);

    User findByEmailAndPassword(String email,String  password);

}
