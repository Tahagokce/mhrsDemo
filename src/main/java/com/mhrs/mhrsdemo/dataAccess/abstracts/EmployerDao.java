package com.mhrs.mhrsdemo.dataAccess.abstracts;


import com.mhrs.mhrsdemo.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
}
