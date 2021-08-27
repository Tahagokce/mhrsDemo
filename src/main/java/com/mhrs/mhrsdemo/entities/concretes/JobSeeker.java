package com.mhrs.mhrsdemo.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "job_seekers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobSeeker  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id  ;




    @Column(name = "user_id")
    private int userId ;

    private int roleId;


}
