package com.mhrs.mhrsdemo.entities.concretes;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "job_positions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPosition {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String position ;




}
