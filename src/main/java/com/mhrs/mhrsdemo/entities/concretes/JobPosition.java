package com.mhrs.mhrsdemo.entities.concretes;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "job_positions")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobPosition {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @Column(name = "position")
    private String position ;




}
