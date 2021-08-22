package com.mhrs.mhrsdemo.api.controllers;

import com.mhrs.mhrsdemo.business.abstracts.UserService;
import com.mhrs.mhrsdemo.core.utilities.results.*;
import com.mhrs.mhrsdemo.entities.concretes.User;
import com.mhrs.mhrsdemo.entities.dto.UserLoginDto;
import com.mhrs.mhrsdemo.entities.dto.UserRegisterDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/account")
public class AccountController extends BaseController {





    private UserService userService;
    private ModelMapper modelMapper;

    @Autowired
    public AccountController( UserService userService , ModelMapper modelMapper) {
        this.userService = userService;

        this.modelMapper = modelMapper;
    }


    @GetMapping("/finduser")
    public ResponseEntity<DataResult<User>> findByUserName ( @RequestBody UserLoginDto user){

        return null ;
    }

    @GetMapping("/login")
   public ResponseEntity<DataResult<User>> findByUserNameAndPassword(  @RequestParam String email, @RequestParam String password ){

        var result =  this.userService.findByNameAndPassword(email, password);
        return ResponseEntity.ok(result);

   }

   @PostMapping("/register")
   public ResponseEntity<Result> register( @RequestBody UserRegisterDto registerDto) {
       if (registerDto.getPassword().equals(registerDto.getRePassword())) {
           User user = modelMapper.map(registerDto, User.class);
           var result = this.userService.add(user);
           return ResponseEntity.ok(result);
       }

       return ResponseEntity.ok(null);

   }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException
            (MethodArgumentNotValidException exceptions){
        Map<String,String> validationErrors = new HashMap<String, String>();
        for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        ErrorDataResult<Object> errors
                = new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
        return errors;
    }
}
