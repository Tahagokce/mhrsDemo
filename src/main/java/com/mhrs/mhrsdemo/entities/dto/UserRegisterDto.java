package com.mhrs.mhrsdemo.entities.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

public class UserRegisterDto {

    private int id ;


    private String email ;


    private String password ;


    private String rePassword ;

    private String firstName;


    private String lastName;

    private String identificationName;


    private Date dateOfBirth;



    private int roleId;


    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentificationName() {
        return identificationName;
    }

    public void setIdentificationName(String identificationName) {
        this.identificationName = identificationName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
