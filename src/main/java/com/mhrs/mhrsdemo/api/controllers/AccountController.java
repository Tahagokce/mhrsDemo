package com.mhrs.mhrsdemo.api.controllers;

import com.mhrs.mhrsdemo.business.abstracts.UserService;
import com.mhrs.mhrsdemo.core.utilities.results.*;
import com.mhrs.mhrsdemo.entities.concretes.User;
import com.mhrs.mhrsdemo.entities.dto.UserRegisterDto;
import com.mhrs.mhrsdemo.entities.mapStruct.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController  {

    private final UserService userService;
    private final UserMapper userMapper;


    @GetMapping("/finduser")
    public ResponseEntity<DataResult<User>> findByUserName ( @RequestParam String email){

        var result =  this.userService.getByEmail(email);
        return ResponseEntity.ok(result) ;
    }

    @GetMapping("/login")
   public ResponseEntity<DataResult<User>> findByUserNameAndPassword(   @RequestParam String email, @RequestParam String password ){

        var result =  this.userService.findByNameAndPassword(email, password);
        return ResponseEntity.ok(result);

   }

   @PostMapping("/register")
   public ResponseEntity<Result> register( @Valid @RequestBody UserRegisterDto registerDto) {

       if (registerDto.getPassword().equals(registerDto.getRePassword())) {
           User user =  userMapper.mapUserToRegister(registerDto);
           var result = this.userService.save(user);
           return ResponseEntity.ok(result);
       }

        return null;
   }

   @GetMapping("/getbyid")
   public ResponseEntity<DataResult<User>> getById(@RequestParam Integer id) {
       var result = this.userService.getById(id);
       return ResponseEntity.ok(result);



   }

    @PostMapping("/roleadd")
    public ResponseEntity<Result> roleSave(int userId, int roleId){
        User user= this.userService.getById(userId).getData();
        user.setRoleId(roleId);
        var result = this.userService.update(user);

        return ResponseEntity.ok(result);
    };


    @PostMapping("/roledetails")
    public ResponseEntity<Result> roleDetails(){

        return null;
    };





}
