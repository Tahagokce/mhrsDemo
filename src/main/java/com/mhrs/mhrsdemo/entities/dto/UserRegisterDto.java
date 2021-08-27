package com.mhrs.mhrsdemo.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterDto {

    private int id ;


    @Email
    private String email ;

    @NotEmpty
    @NotNull
    private String password ;


    private String rePassword ;

    private String firstName;


    private String lastName;

    private String identificationName;


    private Date dateOfBirth;



    private int roleId;



}
