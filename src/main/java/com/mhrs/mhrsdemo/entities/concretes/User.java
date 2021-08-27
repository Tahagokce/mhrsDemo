package com.mhrs.mhrsdemo.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;


    private String email ;


    private String password ;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identification_no")
    private String identificationName;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;


    @Column(name = "role_id")
    private int roleId;


}
