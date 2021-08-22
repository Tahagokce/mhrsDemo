package com.mhrs.mhrsdemo.api.controllers;


import com.mhrs.mhrsdemo.business.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    private UserService userService ;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }



}
