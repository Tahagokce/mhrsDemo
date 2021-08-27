package com.mhrs.mhrsdemo.api.controllers;


import com.mhrs.mhrsdemo.business.abstracts.UserService;
import com.mhrs.mhrsdemo.entities.mapStruct.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final UserService userService ;
    private final UserMapper userMapper;




}
