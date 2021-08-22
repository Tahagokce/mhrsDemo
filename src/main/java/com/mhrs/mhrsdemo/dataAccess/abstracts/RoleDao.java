package com.mhrs.mhrsdemo.dataAccess.abstracts;

import com.mhrs.mhrsdemo.entities.concretes.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role,Integer> {
}
