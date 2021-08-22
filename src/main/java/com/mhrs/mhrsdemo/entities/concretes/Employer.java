package com.mhrs.mhrsdemo.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_sites")
    private String webSites;

    @Column(name = "sites_email")
    private String sitesEmail;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "user_id")
    private int userId;

}
