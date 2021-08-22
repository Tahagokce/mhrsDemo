package com.mhrs.mhrsdemo.business.concretes;

import com.mhrs.mhrsdemo.business.abstracts.RoleService;
import com.mhrs.mhrsdemo.dataAccess.abstracts.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleManager implements RoleService {

    private RoleDao roleDao;
    @Autowired
    public RoleManager(RoleDao roleDao) {
        this.roleDao = roleDao;
    }
}
